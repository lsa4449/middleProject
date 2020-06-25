package kr.or.ddit.view.map;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class kakaoMap extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("kakaoMap.fxml"));

        Scene scene = new Scene(parent);

        primaryStage.setTitle("카카오 지도");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
