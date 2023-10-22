/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infox.dal;

import java.sql.*;

public class ModuloConexao {
    // metodo responsável por estabelecer conexão com o banco
    
    public static Connection conncetor(){
        java.sql.Connection conexao = null;
        // a linha abaixo "chama" o driver
        String driver = "com.mysql.cj.jdbc.Driver";  
        // armazenando informações referente ao banco
        String url = "jdbc:mysql://127.0.0.1:3307/dbinfox";
       // String user = "root";
       // String password = "root";  
        // Estabelencdo a conexão com banco de dados 
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, "root",  "root");
            return conexao;
        } catch (Exception e) {
            System.out.println(e.printStackTrace());
            return null;
        }
        }

    }