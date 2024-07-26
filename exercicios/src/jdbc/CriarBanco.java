package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:mysql://localhost";
        final String usuario = "root";
        final String senha = "12345678";

        Connection conexao  = DriverManager.getConnection(url, usuario, senha);
        System.out.println("Conexão efetuada com suscesso!");
        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
        System.out.println("Banco curso_java criado com sucesso!");


        conexao.close();

    }
}
