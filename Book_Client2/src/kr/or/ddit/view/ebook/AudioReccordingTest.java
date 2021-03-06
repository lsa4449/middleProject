package kr.or.ddit.view.ebook;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AudioReccordingTest extends Application {
	JavaSoundRecorder javaSoundRecorder;

    @Override
    public void start(Stage primaryStage) {       

        Button btn = new Button();
        btn.setText("Start");
        btn.setOnAction((ActionEvent event) -> {        
            if (btn.getText().equals("Start")) {  
                javaSoundRecorder  = new JavaSoundRecorder();
                Thread thread = new Thread(javaSoundRecorder);
                thread.start();

                btn.setText("Stop");
            }
            else {
                javaSoundRecorder.finish();
                javaSoundRecorder.cancel();

                btn.setText("Start");                
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("마이크입력 예제");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
