package visao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ConexaoBD {
    public static Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "joao84143721");
            ResultSet rs;
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
