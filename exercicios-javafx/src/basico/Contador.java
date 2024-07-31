package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

    private int contador = 0;

    @Override
    public void start(Stage stage) throws Exception {
        Label lblTitulo = new Label("Contador");
        lblTitulo.getStyleClass().add("titulo");
        Label lblNumero = new Label(Integer.toString(contador));
        lblNumero.getStyleClass().add("numero");
        Button botaoIncremento  = new Button("+");
        Button botaoDecremento  = new Button("-");
        botaoDecremento.getStyleClass().add("botoes");
        botaoIncremento.getStyleClass().add("botoes");

        HBox boxBotoes = new HBox();
        boxBotoes.setAlignment(Pos.CENTER);
        boxBotoes.setSpacing(10);
        boxBotoes.getChildren().add(botaoDecremento);
        boxBotoes.getChildren().add(botaoIncremento);


        VBox boxPrincipal = new VBox();
        boxPrincipal.setAlignment(Pos.CENTER);
        boxPrincipal.setSpacing(10);
        boxPrincipal.getStyleClass().add("conteudo");
        boxPrincipal.getChildren().add(lblTitulo);
        boxPrincipal.getChildren().add(lblNumero);
        boxPrincipal.getChildren().add(boxBotoes);
        String caminhocss = getClass().getResource("/basico/Contador.css").toExternalForm();

        botaoIncremento.setOnAction(e -> {
            contador++;
            lblNumero.setText(Integer.toString(contador));
            aplicarEstilo(lblNumero);
        });
        botaoDecremento.setOnAction(e -> {
            contador--;
            lblNumero.setText(Integer.toString(contador));
            aplicarEstilo(lblNumero);
        });
        Scene cenaP = new Scene(boxPrincipal,400,400);
        cenaP.getStylesheets().add(caminhocss);
        stage.setScene(cenaP);



        stage.show();
    }

    private void aplicarEstilo(Label lblNumero) {
        lblNumero.getStyleClass().remove("verde");
        lblNumero.getStyleClass().remove("branco");
        lblNumero.getStyleClass().remove("vermelho");
        if (contador < 0){
            lblNumero.getStyleClass().add("vermelho");
        }else if (contador > 0) {
            lblNumero.getStyleClass().add("verde");
        }else {
            lblNumero.getStyleClass().add("branco");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
