package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

public class Contador extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Label lblTitulo = new Label("Contador");
        Label lblNumero = new Label("0");
        Button botaoIncremento  = new Button("-");
        Button botaoDecremento  = new Button("+");

        HBox boxBotoes = new HBox();
        boxBotoes.setAlignment(Pos.CENTER);
        boxBotoes.setSpacing(10);
        boxBotoes.getChildren().add(botaoDecremento);
        boxBotoes.getChildren().add(botaoIncremento);

        VBox boxPrincipal = new VBox();
        boxPrincipal.setAlignment(Pos.CENTER);
        boxPrincipal.setSpacing(10);
        boxPrincipal.getChildren().add(lblTitulo);
        boxPrincipal.getChildren().add(lblNumero);
        boxPrincipal.getChildren().add(boxBotoes);

        botaoIncremento.setOnAction(e -> System.out.println("A"));


        Scene cenaP = new Scene(boxPrincipal,400,400);
        stage.setScene(cenaP);


        stage.show();
    }

    use

    public static void main(String[] args) {
        launch(args);
    }
}
