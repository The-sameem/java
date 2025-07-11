package com.example.demo.dto;

import lombok.Data;
import java.util.List;

@Data
public class DiseaseDTO {
    private Long id;
    private String name;
    private String description;
    private List<CureDTO> cures;
} 