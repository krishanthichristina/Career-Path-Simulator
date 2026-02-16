package org.example.careerpathsimulator.repository;


import org.example.careerpathsimulator.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}