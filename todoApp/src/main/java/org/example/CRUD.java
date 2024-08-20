package org.example;
import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class CRUD {
    private static final String  URL = "jdbc:sqlite:mydatabase.db";

    public void addTask(Connection connection , String input){
        String sql = "INSERT INTO tasks ('NewTasks') VALUES (?)";
        try (PreparedStatement preparedState =  connection.prepareStatement(sql)){
            preparedState.setString(1 , input);
            preparedState.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void removeTask(Connection connection , String input){
        String sql = "DELETE FROM tasks WHERE ('NewTasks') = (?)";
        try(PreparedStatement preparedState = connection.prepareStatement(sql)) {
            preparedState.setString(1,input);
            preparedState.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//    public void updateTask(Connection connection){
//        String sql = "UPDATE (mydatabase) SET (New tasks) = (?) WHERE id  = (?)";
//        try(PreparedStatement preparedState = connection.prepareStatement(sql) ) {
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
}