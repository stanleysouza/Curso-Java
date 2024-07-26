package jdbc;

import java.awt.desktop.SystemEventListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DesafioUpdate {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o codigo da pessoa: ");
        int id = entrada.nextInt();
        String sql = "SELECT * FROM pessoas WHERE codigo = ? ";

        Connection conexao = FabricaConexao.getConexao();
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            Pessoa p = new Pessoa(rs.getString(2), rs.getInt(1));
            System.out.println("o nome Atual é : " + p.getNome());
            System.out.print("Informe o novo nome:");
            entrada.nextLine();
            String novonome = entrada.nextLine();

            sql = "UPDATE pessoas SET NOME = ? WHERE codigo = ?";

            ps.close();

            ps = conexao.prepareStatement(sql);
            ps.setString(1, novonome);
            ps.setInt(2, id);
            ps.execute();
        }else {
            System.out.println("Codigo de pessoa nao existe");
        }





        entrada.close();
        conexao.close();
        ps.close();
    }





}
