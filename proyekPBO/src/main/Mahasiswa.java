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
public class Mahasiswa implements Serializable{
    private String nim, nama, kelas, alamat, email, tlpn, tempat_lahir, tanggal_lahir;

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
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

    public String getTempatLahir() {
        return tempat_lahir;
    }

    public String getTanggalLahir() {
        return tanggal_lahir;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTlpn(String tlpn) {
        this.tlpn = tlpn;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempat_lahir = tempatLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggal_lahir = tanggalLahir;
    }
    
    
}
