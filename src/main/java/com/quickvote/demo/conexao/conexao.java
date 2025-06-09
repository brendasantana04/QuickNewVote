package com.quickvote.demo.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

    private static final String url = "jdbc:mysql://localhost:3306/QuickVote";
    private static final String usuario = "root";
    private static final String senha = "1234";

    private static Connection conn;

    public static Connection getConexao() {


            try {
                if (conn == null) {
                    conn = DriverManager.getConnection(url, usuario, senha);
                    return conn;
                } else {
                    return conn;
                }
            } catch (SQLException e) {
                System.out.println("Driver do banco de dados não localizado");
                return null;
            }

    }
}
