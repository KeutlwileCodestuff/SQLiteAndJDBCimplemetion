package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseManager {
    private static final String URL = "jdbc:sqlite:mydatabase.db";

    public Connection manager(){
        try {
            // Establish connection
            Connection conn = DriverManager.getConnection(URL);
            Statement stmt = conn.createStatement();

            // Create a table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS users ( New tasks TEXT NOT NULL  , Completed Tasks TEXT NOT NULL)";
            stmt.execute(createTableSQL);

//            // Insert data
//            String insertSQL = "INSERT INTO TASKS (New Tasks" +
//                    ") VALUES ('Alice'), ('Bob')";
//            stmt.executeUpdate(insertSQL);

            // Query data
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

}
