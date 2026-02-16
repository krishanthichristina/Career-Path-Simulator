package org.example.careerpathsimulator.repository;


import org.example.careerpathsimulator.entity.CareerPath;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CareerPathRepository extends JpaRepository<CareerPath, Long> {
}