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
                    methods.addTask(connect);
                    break;
                case "2":
                    methods.removeTask(connect);
                    break;
                case "3":
                    connect.close();
                    break;
            }

        }
    }
}