import java.sql.*;
import java.util.Scanner;

public class Vulnerable {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine(); 

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
        Statement stmt = con.createStatement();
        // Construção vulnerável da query
        String query = "SELECT * FROM users WHERE name = '" + userInput + "'"; 
        System.out.println("Executando query: " + query); 
        ResultSet rs = stmt.executeQuery(query);
        
        while (rs.next()) {
            System.out.println(rs.getString("name"));
        }
    }
}
