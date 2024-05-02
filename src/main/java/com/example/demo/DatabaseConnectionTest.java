package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionTest {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/SpringBootDB";
        String username = "postgres";
        String password = "Test1234";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to the DB");
        } catch (SQLException e) {
            System.out.println("Failed to connect to DB");
            e.printStackTrace();
        }
    }

}