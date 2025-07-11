package com.example.demo.controller;

import com.example.demo.model.Disease;
import com.example.demo.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/diseases")
public class DiseaseController {
    @Autowired
    private DiseaseService diseaseService;

    @GetMapping
    public List<Disease> getAllDiseases() {
        return diseaseService.getAllDiseases();
    }

    @GetMapping("/{id}")
    public Optional<Disease> getDiseaseById(@PathVariable Long id) {
        return diseaseService.getDiseaseById(id);
    }

    @PostMapping
    public Disease createDisease(@RequestBody Disease disease) {
        return diseaseService.createDisease(disease);
    }

    @PutMapping("/{id}")
    public Disease updateDisease(@PathVariable Long id, @RequestBody Disease disease) {
        return diseaseService.updateDisease(id, disease);
    }

    @DeleteMapping("/{id}")
    public void deleteDisease(@PathVariable Long id) {
        diseaseService.deleteDisease(id);
    }
} 