/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.Arrays;
/**
 *
 * @author kadekpurna22
 */
public class Database implements Serializable{
    public static Database instance;
    
    private final String DB_TYPE = "mysql";
    private final String DB_HOST = "localhost";
    private final String DB_PORT = "3306";
    private final String DB_NAME = "proyekpbo";
    private final String DB_USER = "root";
    private final String DB_PASS = "";

    private Database(){
    }
    
    public static synchronized Database getInstance(){
        if (instance == null){
            instance = new Database();
        }
        return instance;
    }
    
    private Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:"+DB_TYPE+"://"+DB_HOST+":"+DB_PORT+"/"+DB_NAME,DB_USER,DB_PASS);
    }
    
    public void insertPendaftar(Pendaftar mahasiswa) throws SQLException{
    Connection conn = getConnection();
        try{
            String sql = "INSERT INTO pendaftar VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, mahasiswa.getNamaKegiatan());
            stmt.setString(2, mahasiswa.getNim());
            stmt.setString(3, mahasiswa.getNama());
            stmt.setString(4, mahasiswa.getJk());
            stmt.setString(5, mahasiswa.getTingkat());
            stmt.setString(6, mahasiswa.getAlamat());
            stmt.setString(7, mahasiswa.getEmail());
            stmt.setString(8, mahasiswa.getNo_telp());
            stmt.setString(9, mahasiswa.getTtl());
            int rowsInserted = stmt.executeUpdate();
            
            if (rowsInserted > 0) {
                System.out.println("Insert data berhasil!");
            } else {
                System.out.println("Gagal menginsert data");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally{
            if(conn!=null){
                conn.close();
            }
        }
    }
    
}
