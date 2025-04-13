import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    static private final String URL = "jdbc:postgresql://localhost:5432/userlist";
    static private final String USER = "denis";
    private static final String PASSWORD = "gfhjkm";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
