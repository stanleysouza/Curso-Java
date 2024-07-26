package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoasDesafio {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        Connection conexao = FabricaConexao.getConexao();

        System.out.print("Digite uma parte do nome para consulta: ");
        String partenome = entrada.nextLine();

        String sql = "Select * from pessoas where nome like ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%"+partenome+"%");
        ResultSet resultado = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()){
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(nome, codigo));
        }

        for(Pessoa p: pessoas){
            System.out.println(p.getCodigo() + " - " + p.getNome());
        }

        stmt.close();
        conexao.close();
        entrada.close();
    }
}
