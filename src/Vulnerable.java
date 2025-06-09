// src/Vulnerable.java
import java.sql.*;
import java.util.Scanner;

public class Vulnerable {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine(); // ← entrada vinda do usuário

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
        Statement stmt = con.createStatement();
        String query = "SELECT * FROM users WHERE name = '" + userInput + "'";
        ResultSet rs = stmt.executeQuery(query);
    }
}
