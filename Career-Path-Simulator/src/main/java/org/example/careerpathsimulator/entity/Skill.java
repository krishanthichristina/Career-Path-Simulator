package org.example.careerpathsimulator.entity;


import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "skills")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    private String category;

    private LocalDateTime createdAt = LocalDateTime.now();

    @OneToMany(mappedBy = "skill", cascade = CascadeType.ALL)
    private List<CareerRequirement> requirements;

    // Getters and Setters
}
