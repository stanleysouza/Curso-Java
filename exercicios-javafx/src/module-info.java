module br.com.cod3r.exerciciosjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens basico;
    opens layout;
    opens fxml;

}