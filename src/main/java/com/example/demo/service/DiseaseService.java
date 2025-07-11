package com.example.demo.service;

import com.example.demo.model.Disease;
import com.example.demo.repository.DiseaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiseaseService {
    @Autowired
    private DiseaseRepository diseaseRepository;

    public List<Disease> getAllDiseases() {
        return diseaseRepository.findAll();
    }

    public Optional<Disease> getDiseaseById(Long id) {
        return diseaseRepository.findById(id);
    }

    public Disease createDisease(Disease disease) {
        return diseaseRepository.save(disease);
    }

    public Disease updateDisease(Long id, Disease diseaseDetails) {
        return diseaseRepository.findById(id).map(disease -> {
            disease.setName(diseaseDetails.getName());
            disease.setDescription(diseaseDetails.getDescription());
            return diseaseRepository.save(disease);
        }).orElse(null);
    }

    public void deleteDisease(Long id) {
        diseaseRepository.deleteById(id);
    }
} 