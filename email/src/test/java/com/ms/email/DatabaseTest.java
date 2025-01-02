package com.ms.email;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseTest {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/ms-email";
        String username = "postgres";
        String password = "postgres";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("Conexão bem-sucedida!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}