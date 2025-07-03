package com.example.demo.controller;

import com.example.demo.model.Mahasiswa;
import com.example.demo.service.MahasiswaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class MahasiswaController {
    
    @Autowired
    private MahasiswaService mahasiswaService;
    
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listMahasiswa", mahasiswaService.getAllMahasiswa());
        return "index";
    }
    
    @GetMapping("/showNewMahasiswaForm")
    public String showNewMahasiswaForm(Model model) {
        model.addAttribute("mahasiswa", new Mahasiswa());
        return "add";
    }
    
    @PostMapping("/saveMahasiswa")
    public String saveMahasiswa(@Valid @ModelAttribute("mahasiswa") Mahasiswa mahasiswa, 
                              BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return mahasiswa.getId() == null ? "add" : "edit";
        }
        mahasiswaService.saveMahasiswa(mahasiswa);
        return "redirect:/";
    }
    
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
        Mahasiswa mahasiswa = mahasiswaService.getMahasiswaById(id);
        model.addAttribute("mahasiswa", mahasiswa);
        return "edit";
    }
    
    @GetMapping("/deleteMahasiswa/{id}")
    public String deleteMahasiswa(@PathVariable(value = "id") long id) {
        mahasiswaService.deleteMahasiswaById(id);
        return "redirect:/";
    }
}