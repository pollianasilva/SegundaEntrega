package com.bflor.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    
    private static Connection connection;

    public static Connection getConnection() {
        try {
            if (connection == null) {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bflor", "root", "root");
                return connection;
            } else {
                return connection;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private static final String URL = "jdbc:mysql://localhost:3306/beijaFlorTurismo";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Encontrado!");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado! Mensagem: " + e.getLocalizedMessage());
        }
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conectado com sucesso!");
            return connection;
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar ao Banco! Mensagem: " + e.getMessage());
            return null;
        }
    }
}
