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
public class Pendaftar implements Serializable {
    private String nama_kegiatan, nim, nama, jk, tingkat, alamat, email, tlpn, ttl; 

    public String getNamaKegiatan(){
        return nama_kegiatan;
    }
    
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

    public String getTlpn() {
        return tlpn;
    }

    public String getTtl() {
        return ttl;
    }
    
    public void setNamaKegiatan(String nama_kegiatan){
        this.nama_kegiatan = nama_kegiatan;
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

    public void setTlpn(String no_telp) {
        this.tlpn = tlpn;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }
}