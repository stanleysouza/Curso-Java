package jdbc;

import com.mysql.cj.jdbc.SuspendableXAConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();
        String sql = "Select * from pessoas";

        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);

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
    }
}
