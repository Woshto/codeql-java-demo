// src/Vulnerable.java
import java.sql.*;

public class Vulnerable {
    public static void main(String[] args) throws Exception {
        String userInput = args[0];
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
        Statement stmt = con.createStatement();
        String query = "SELECT * FROM users WHERE name = '" + userInput + "'";
        ResultSet rs = stmt.executeQuery(query);
    }
}
