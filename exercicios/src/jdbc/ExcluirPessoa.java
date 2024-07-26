package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o Codigo: ");
        int codigo = entrada.nextInt();

        Connection conexao = FabricaConexao.getConexao();
        String sql = "DELETE FROM pessoas WHERE codigo = ?";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1,codigo);
        if(ps.executeUpdate() > 0){
            System.out.println("Pessoa Excluida com sucesso!");
        }else{
            System.out.println("Pessoa nao encontrada");
        }

        entrada.close();
        conexao.close();

    }
}
