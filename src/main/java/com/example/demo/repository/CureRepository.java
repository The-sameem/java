package com.example.demo.repository;

import com.example.demo.model.Cure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CureRepository extends JpaRepository<Cure, Long> {
} 