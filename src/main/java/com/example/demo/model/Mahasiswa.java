package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "mahasiswa")
public class Mahasiswa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "Nama wajib diisi")
    @Size(min = 3, max = 50, message = "Nama harus 3-50 karakter")
    private String nama;
    
    @NotBlank(message = "NIM wajib diisi")
    @Pattern(regexp = "^[0-9]{8,15}$", message = "NIM harus angka (8-15 digit)")
    private String nim;
    
    @NotBlank(message = "Jurusan wajib diisi")
    private String jurusan;
    
    private LocalDateTime tanggalKunjungan;
    
    @NotBlank(message = "Keperluan wajib diisi")
    private String keperluan;
    
    // Constructor, Getter, Setter
    public Mahasiswa() {
        this.tanggalKunjungan = LocalDateTime.now();
    }

    // Getter dan Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public LocalDateTime getTanggalKunjungan() {
        return tanggalKunjungan;
    }

    public void setTanggalKunjungan(LocalDateTime tanggalKunjungan) {
        this.tanggalKunjungan = tanggalKunjungan;
    }

    public String getKeperluan() {
        return keperluan;
    }

    public void setKeperluan(String keperluan) {
        this.keperluan = keperluan;
    }
}