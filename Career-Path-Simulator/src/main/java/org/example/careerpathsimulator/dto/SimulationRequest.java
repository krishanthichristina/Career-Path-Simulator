package org.example.careerpathsimulator.dto;

import java.util.List;

public class SimulationRequest {

    private Long careerId;
    private List<String> userSkills;
    private int yearsExperience;

    public Long getCareerId() {
        return careerId;
    }

    public void setCareerId(Long careerId) {
        this.careerId = careerId;
    }

    public List<String> getUserSkills() {
        return userSkills;
    }

    public void setUserSkills(List<String> userSkills) {
        this.userSkills = userSkills;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }
}
