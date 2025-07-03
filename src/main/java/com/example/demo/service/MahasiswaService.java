package com.example.demo.service;

import com.example.demo.exception.MahasiswaNotFoundException;
import com.example.demo.model.Mahasiswa;
import com.example.demo.repository.MahasiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MahasiswaService implements IMahasiswaService {

    private final MahasiswaRepository mahasiswaRepository;

    @Autowired
    public MahasiswaService(MahasiswaRepository mahasiswaRepository) {
        this.mahasiswaRepository = mahasiswaRepository;
    }

    @Override
    public List<Mahasiswa> getAllMahasiswa() {
        return mahasiswaRepository.findAll();
    }

    @Override
    public void saveMahasiswa(Mahasiswa mahasiswa) {
        mahasiswaRepository.save(mahasiswa);
    }

    @Override
    public Mahasiswa getMahasiswaById(Long id) {
        return mahasiswaRepository.findById(id)
                .orElseThrow(() -> new MahasiswaNotFoundException(id));
    }

    @Override
    public void deleteMahasiswaById(Long id) {
        mahasiswaRepository.deleteById(id);
    }
}
