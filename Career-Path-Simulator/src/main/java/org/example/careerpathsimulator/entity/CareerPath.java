package org.example.careerpathsimulator.entity;


import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "career_paths")
public class CareerPath {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RiskLevel riskLevel;

    @Column(nullable = false)
    private Integer demandScore;

    @Column(nullable = false)
    private BigDecimal baseSalary;

    @Column(nullable = false)
    private BigDecimal annualGrowthRate;

    @Column(columnDefinition = "TEXT")
    private String description;

    private LocalDateTime createdAt = LocalDateTime.now();

    @OneToMany(mappedBy = "careerPath", cascade = CascadeType.ALL)
    private List<CareerRequirement> requirements;

    // Getters and Setters
}

