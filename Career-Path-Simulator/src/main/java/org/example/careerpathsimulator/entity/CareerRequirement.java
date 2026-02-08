package org.example.careerpathsimulator.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "career_requirements")
public class CareerRequirement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "career_id", nullable = false)
    private CareerPath careerPath;

    @ManyToOne
    @JoinColumn(name = "skill_id", nullable = false)
    private Skill skill;

    @Column(nullable = false)
    private Integer requiredLevel;

    private LocalDateTime createdAt = LocalDateTime.now();

    // Getters and Setters
}
