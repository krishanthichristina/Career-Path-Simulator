package org.example.careerpathsimulator.service;

import org.example.careerpathsimulator.dto.SimulationRequest;
import org.example.careerpathsimulator.dto.SimulationResponse;
import org.example.careerpathsimulator.entity.CareerRequirement;
import org.example.careerpathsimulator.repository.CareerRequirementRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SimulationService {

    private final CareerRequirementRepository requirementRepository;

    public SimulationService(CareerRequirementRepository requirementRepository) {
        this.requirementRepository = requirementRepository;
    }

    public SimulationResponse simulate(SimulationRequest request) {

        List<CareerRequirement> requirements =
                requirementRepository.findByCareerPathId(request.getCareerId());

        List<String> missingSkills = new ArrayList<>();

        for (CareerRequirement req : requirements) {
            if (!request.getUserSkills().contains(req.getSkill().getName())) {
                missingSkills.add(req.getSkill().getName());
            }
        }

        int estimatedMonths = missingSkills.size() * 3;
        int difficultyScore = missingSkills.size() * 10;

        String riskLevel;
        if (difficultyScore < 20) {
            riskLevel = "LOW";
        } else if (difficultyScore < 50) {
            riskLevel = "MEDIUM";
        } else {
            riskLevel = "HIGH";
        }

        SimulationResponse response = new SimulationResponse();
        response.setMissingSkills(missingSkills);
        response.setEstimatedMonths(estimatedMonths);
        response.setDifficultyScore(difficultyScore);
        response.setRiskLevel(riskLevel);

        return response;
    }
}
