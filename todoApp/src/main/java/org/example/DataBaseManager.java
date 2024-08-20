package org.example;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class DataBaseManager {
    private static final String URL = "jdbc:sqlite:mydatabase.db";
    public Connection connect(){
        Connection connection = null ;
        try {
            connection =  DriverManager.getConnection(URL);
            String createTableSQL = "CREATE TABLE IF NOT EXISTS tasks ( NewTasks, CompletedTasks)";
            Statement stmt = connection.createStatement();
            stmt.execute(createTableSQL);

        } catch (SQLException e) {
            System.err.println("CONNECTION ERROR !: " + e.getMessage());
            throw new RuntimeException(e);
        }
        return connection;
    }
}
