package org.example;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        CRUD methods = new CRUD();
        DataBaseManager manager = new DataBaseManager();

        String input;
        while(true){
            Connection connect = manager.connect();

            System.out.println("What would you like to do ? \n" +
                    "1.Add task \n" +
                    "2.Remove task \n" +
                    "3.Done" );

            input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("add task: ");
                    input = scanner.nextLine();
                    methods.addTask(connect , input);
                    System.out.println("TASK ADDED!");
                    break;
                case "2":
                    System.out.print("delete task: ");
                    input = scanner.nextLine();
                    methods.removeTask(connect , input);
                    System.out.println("TASK DELETED!");
                    break;
                case "3":
                    connect.close();
                    break;
            }

        }
    }
}