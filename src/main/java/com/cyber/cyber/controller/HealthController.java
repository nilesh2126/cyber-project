package com.cyber.cyber.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/api/health")
    public Map<String, String> health() {

        return Map.of(
                "status", "Running",
                "application", "Sentinel AI",
                "version", "1.0"
        );
    }
}