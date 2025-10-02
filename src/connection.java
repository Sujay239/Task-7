import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/Emp";
    private static final String username = "root";
    private static final String password = "admin@123";

    public static Connection getConnection() {
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
//            System.out.println("Connected to the database successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
