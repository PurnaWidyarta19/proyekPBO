/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.Serializable;

/**
 *
 * @author kadekpurna22
 */
public class PendaftarKegiatan implements Serializable {
    private String nim, nama, jk, tingkat, alamat, email, no_telp, ttl; 

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getJk() {
        return jk;
    }

    public String getTingkat() {
        return tingkat;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getEmail() {
        return email;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public String getTtl() {
        return ttl;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public void setTingkat(String tingkat) {
        this.tingkat = tingkat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }
}