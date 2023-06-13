/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author kadekpurna22
 */
public class my_DB {
    private static final String URL = "jdbc:mysql://localhost:3306/proyekpbo";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    private static Connection connection;
    
    public static Connection getConnection(){
        if (connection == null){
            try{
               connection = DriverManager.getConnection(URL, USERNAME, PASSWORD); 
            }catch (SQLException e){
                System.out.println("Koneksi ke database gagal "+ e.getMessage());
            }
        }
        return connection;
    }
}
