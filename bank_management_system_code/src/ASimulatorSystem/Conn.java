package ASimulatorSystem;

import java.sql.*;

public class Conn {
    public Connection c;
    public Statement s;

    public Conn() {  
        try {  
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Read database configuration from environment variables or defaults
            String dbUrl = System.getenv("DB_URL");
            String dbUser = System.getenv("DB_USER");
            String dbPass = System.getenv("DB_PASS");

            if (dbUrl == null || dbUrl.trim().isEmpty()) {
                dbUrl = "jdbc:mysql://localhost:3306/bankmanagementsystem?useSSL=false&allowPublicKeyRetrieval=true";
            }
            if (dbUser == null || dbUser.trim().isEmpty()) {
                dbUser = "root";
            }
            if (dbPass == null) {
                dbPass = ""; // Default empty password for local development setup
            }

            c = DriverManager.getConnection(dbUrl, dbUser, dbPass);    
            s = c.createStatement(); 
        } catch (Exception e) { 
            System.out.println("Database Connection Error: " + e.getMessage());
        }  
    }  
}
