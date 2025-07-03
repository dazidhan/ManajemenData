package com.example.demo.service;

import com.example.demo.model.Mahasiswa;

import java.util.List;

public interface IMahasiswaService {
    List<Mahasiswa> getAllMahasiswa();
    void saveMahasiswa(Mahasiswa mahasiswa);
    Mahasiswa getMahasiswaById(Long id);
    void deleteMahasiswaById(Long id);
}
