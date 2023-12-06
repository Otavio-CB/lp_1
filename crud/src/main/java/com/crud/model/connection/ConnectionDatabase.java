package com.crud.model.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {
    private static final String url = "jdbc:postgresql://localhost:5432/crud";
    private static final String user = "postgres";
    private static final String password = "adm123";
    private static Connection connection;

    public Connection getConexao() {
        try {
            if (connection == null) {
                Class.forName("org.postgresql.Driver");
                System.out.println("Banco conectado");
                connection = DriverManager.getConnection(url, user, password);
                return connection;
            } else {
                return connection;
            }
        } catch (SQLException e) {
            System.out.println("Erro: Falha na conexão com o banco de dados.");
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            System.out.println("Erro: Driver JDBC não encontrado.");
            e.printStackTrace();
            return null;
        }
    }
}