package org.example;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseManager {
    private static final String URL = "jdbc:sqlite:mydatabase.db";

    public Connection connect(){
        Connection connection = null ;
        try {
            connection =  DriverManager.getConnection(URL);

            Statement stmt = connection.createStatement();
            String createTableSQL = "CREATE TABLE IF NOT EXISTS users ( New tasks TEXT NOT NULL  , Completed Tasks TEXT NOT NULL)";
            stmt.execute(createTableSQL);

        } catch (SQLException e) {
            System.err.println("CONNECTION ERROR !: " + e.getMessage());
            throw new RuntimeException(e);
        }
        return connection ;
    }

    public void closeResources(Connection connection , Statement statement , ResultSet resultSet) throws SQLException {
        connection.close();
        statement.close();
        resultSet.close();
    }
}
