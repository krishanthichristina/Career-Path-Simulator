package org.example.careerpathsimulator.repository;


import org.example.careerpathsimulator.entity.CareerRequirement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CareerRequirementRepository extends JpaRepository<CareerRequirement, Long> {

    List<CareerRequirement> findByCareerPathId(Long careerId);
}
