package org.example.careerpathsimulator.dto;

import java.util.List;

public class SimulationResponse {

    private List<String> missingSkills;
    private int estimatedMonths;
    private String riskLevel;
    private int difficultyScore;

    public List<String> getMissingSkills() {
        return missingSkills;
    }

    public void setMissingSkills(List<String> missingSkills) {
        this.missingSkills = missingSkills;
    }

    public int getEstimatedMonths() {
        return estimatedMonths;
    }

    public void setEstimatedMonths(int estimatedMonths) {
        this.estimatedMonths = estimatedMonths;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public int getDifficultyScore() {
        return difficultyScore;
    }

    public void setDifficultyScore(int difficultyScore) {
        this.difficultyScore = difficultyScore;
    }
}
