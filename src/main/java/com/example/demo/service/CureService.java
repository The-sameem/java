package com.example.demo.service;

import com.example.demo.model.Cure;
import com.example.demo.repository.CureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CureService {
    @Autowired
    private CureRepository cureRepository;

    public List<Cure> getAllCures() {
        return cureRepository.findAll();
    }

    public Optional<Cure> getCureById(Long id) {
        return cureRepository.findById(id);
    }

    public Cure createCure(Cure cure) {
        return cureRepository.save(cure);
    }

    public Cure updateCure(Long id, Cure cureDetails) {
        return cureRepository.findById(id).map(cure -> {
            cure.setTreatment(cureDetails.getTreatment());
            cure.setMedication(cureDetails.getMedication());
            cure.setDoctor(cureDetails.getDoctor());
            return cureRepository.save(cure);
        }).orElse(null);
    }

    public void deleteCure(Long id) {
        cureRepository.deleteById(id);
    }
} 