package com.mahin.quiz_platform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Quiz_Platform {
     
    private static final String URL = "jdbc:mysql://localhost:3306/quiz_platform";
    private static final String USER = "root";
    private static final String PASSWORD = "password";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    public static void main(String[] args) {
        
        login n =new login();
        n.setVisible(true);
        System.out.println("Hello World!");   
    }
}
