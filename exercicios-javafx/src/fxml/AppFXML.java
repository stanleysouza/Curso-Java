package fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import layout.AppLayout;

import java.net.URL;

public class AppFXML extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        URL arquivoFXML = getClass().getResource("/fxml/login.fxml");
        GridPane raiz =  FXMLLoader.load(arquivoFXML);
        Scene cena = new Scene(raiz,350,400);
        stage.setTitle("Tela de login");
        stage.setResizable(false);
        stage.setScene(cena);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
