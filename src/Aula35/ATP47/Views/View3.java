package Aula35.ATP47.Views;
/* Delete as ultimas categorias cadastradas.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class View3{
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "2609");

            Statement statement = conn.createStatement();
            String sql = "delete from categoria where id > 4";
            statement.execute(sql, statement.RETURN_GENERATED_KEYS);
            int linhasAfetadas = statement.getUpdateCount();
            System.out.println(linhasAfetadas);

            conn.close();
        } catch (SQLException e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
