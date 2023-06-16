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
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, mahasiswa.getNamaKegiatan());
            pstmt.setString(2, mahasiswa.getNim());
            pstmt.setString(3, mahasiswa.getNama());
            pstmt.setString(4, mahasiswa.getJk());
            pstmt.setString(5, mahasiswa.getTingkat());
            pstmt.setString(6, mahasiswa.getAlamat());
            pstmt.setString(7, mahasiswa.getEmail());
            pstmt.setString(8, mahasiswa.getNo_telp());
            pstmt.setString(9, mahasiswa.getTtl());
            int rowsInserted = pstmt.executeUpdate();
            
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
    
    public void insertAnggotaUKM(Mahasiswa mahasiswa) throws SQLException{
        Connection conn = getConnection();
        
        try{
            String sql ="INSERT INTO anggota VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, mahasiswa.getNim());
            pstmt.setString(2, mahasiswa.getNama());
            pstmt.setString(3, mahasiswa.getKelas());
            pstmt.setString(4, mahasiswa.getAlamat());
            pstmt.setString(5, mahasiswa.getEmail());
            pstmt.setString(6, mahasiswa.getTlpn());
            pstmt.setString(7, mahasiswa.getTempatLahir());
            pstmt.setString(8, mahasiswa.getTanggalLahir());
            pstmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(conn!=null){
                conn.close();
            }
        }
    }
    
    public List<Mahasiswa> getListMahasiswa() throws SQLException{
        List<Mahasiswa> mhsList = new ArrayList<>();
        Connection conn = getConnection();
        try{
            String sql = "SELECT * FROM anggota";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNim(rs.getString("nim"));
                mhs.setNama(rs.getString("nama"));
                mhs.setKelas(rs.getString("kelas"));
                mhs.setAlamat(rs.getString("alamat"));
                mhs.setEmail(rs.getString("email"));
                mhs.setTlpn(rs.getString("tlpn"));
                mhs.setTempatLahir(rs.getString("tempat_lahir"));
                mhs.setTanggalLahir(rs.getString("tanggal_lahir"));
                
                mhsList.add(mhs);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if (conn!=null){
            conn.close();
            }
        }
        return mhsList;
    }
    
    public void updateMahasiswa(Mahasiswa mahasiswa, String nim) throws SQLException{
        Connection conn = getConnection();
        try{
            String sql = "UPDATE anggota SET nim=?, nama=?, kelas=?, alamat?, email=?, tlpn=?, tempat_lahir=?, tanggal_lahir=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, mahasiswa.getNim());
            pstmt.setString(2, mahasiswa.getNama());
            pstmt.setString(3, mahasiswa.getKelas());
            pstmt.setString(4, mahasiswa.getAlamat());
            pstmt.setString(5, mahasiswa.getEmail());
            pstmt.setString(6, mahasiswa.getTlpn());
            pstmt.setString(7, mahasiswa.getTempatLahir());
            pstmt.setString(8, mahasiswa.getTanggalLahir());
            pstmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(conn!=null){
                conn.close();
            }
        }
    }
    
    public void deteleMahasiswa(String nim) throws SQLException{
        Connection conn = getConnection();
        try{
            String sql = "DELETE from anggota WHERE nim = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nim);
            pstmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(conn!=null){
                conn.close();
            }
        }
    }
}
