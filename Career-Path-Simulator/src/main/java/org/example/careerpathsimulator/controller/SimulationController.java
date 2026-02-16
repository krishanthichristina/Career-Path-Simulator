package org.example.careerpathsimulator.controller;

import org.example.careerpathsimulator.dto.SimulationRequest;
import org.example.careerpathsimulator.dto.SimulationResponse;
import org.example.careerpathsimulator.service.SimulationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/simulation")
@CrossOrigin
public class SimulationController {

    private final SimulationService simulationService;

    public SimulationController(SimulationService simulationService) {
        this.simulationService = simulationService;
    }

    @PostMapping
    public SimulationResponse simulate(@RequestBody SimulationRequest request) {
        return simulationService.simulate(request);
    }
}
