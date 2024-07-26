package jdbc;

public class DAOTeste {
    public static void main(String[] args) {
        DAO dao = new   DAO();

        String sql = "INSERT INTO pessoas (nome) values (?)";
        System.out.println(dao.incluir(sql, "Joao da silva"));
        System.out.println(dao.incluir(sql, "Ana Julia"));
        System.out.println(dao.incluir(sql, "Djalma pereira"));


        dao.close();
    }
}
