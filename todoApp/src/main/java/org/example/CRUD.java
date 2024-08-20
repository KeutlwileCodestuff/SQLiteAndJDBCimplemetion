package org.example;
import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class CRUD {
    private static final String  URL = "jdbc:sqlite:mydatabase.db";
    String input ;
    public void addTask(Connection connection , Statement statement){
        String sql = "INSERT INTO (New tasks) VALUES (?)";
        try (PreparedStatement preparedState =  connection.prepareStatement(sql)){
            preparedState.setString(1 , input);
            preparedState.execute();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void removeTask(){

    }
    public void updateTask(){

    }
}