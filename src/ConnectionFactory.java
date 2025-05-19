import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection criaConexao() throws SQLException {

        String url = "jdbc:mysql://localhost:3306/bd_ava1";
        String user = "root";
        String password = "Melon@123";

        return DriverManager.getConnection(url, user, password);
    }

}
