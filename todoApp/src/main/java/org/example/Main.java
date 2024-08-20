package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CRUD methods = new CRUD();
        String input;
        while(true){
            System.out.println("What would you like to do ? \n" +
                    "1.Add task \n" +
                    "2.Remove task \n" +
                    "3.Update task");
            input = scanner.nextLine();
            switch (input) {
                case "1":
                    methods.addTask();
                    break;
                case "2":
                    methods.removeTask();
                    break;
                case "3":
                    methods.updateTask();
                    break;
            }
            if ( input.toLowerCase() == "done"){
//                "close connection and  then break "
            }
        }
    }
}