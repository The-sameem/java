package com.example.demo.controller;

import com.example.demo.model.Cure;
import com.example.demo.service.CureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cures")
public class CureController {
    @Autowired
    private CureService cureService;

    @GetMapping
    public List<Cure> getAllCures() {
        return cureService.getAllCures();
    }

    @GetMapping("/{id}")
    public Optional<Cure> getCureById(@PathVariable Long id) {
        return cureService.getCureById(id);
    }

    @PostMapping
    public Cure createCure(@RequestBody Cure cure) {
        return cureService.createCure(cure);
    }

    @PutMapping("/{id}")
    public Cure updateCure(@PathVariable Long id, @RequestBody Cure cure) {
        return cureService.updateCure(id, cure);
    }

    @DeleteMapping("/{id}")
    public void deleteCure(@PathVariable Long id) {
        cureService.deleteCure(id);
    }
} 