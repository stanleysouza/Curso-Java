package fxml;


import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import org.controlsfx.control.Notifications;


public class LoginControlador {

    @FXML
    private TextField email;
    @FXML
    private TextField password;

    public void entrar(){
        boolean emailValido = email.getText().equals("aluno@cod3r.com.br");
        boolean senhaValida = password.getText().equals("12345678");

        if(emailValido && senhaValida) {
            Notifications.create()
                    .position(Pos.TOP_RIGHT)
                    .title("Login FXML")
                    .text("Login efetuado com sucesso!")
                    .showInformation();
        } else {
            Notifications.create()
                    .position(Pos.TOP_RIGHT)
                    .title("Login FXML")
                    .text("Usuário e Senha inválidos!")
                    .showError();
        }
    }
}
