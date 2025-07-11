package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String treatment;
    private String medication;
    private String doctor;

    @ManyToOne
    @JoinColumn(name = "disease_id")
    private Disease disease;
} 