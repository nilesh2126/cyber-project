package com.cyber.cyber.controller;

import java.util.Map;
import com.cyber.cyber.model.Tip;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cyber.cyber.model.URLRequest;

import com.cyber.cyber.service.securityservice;

@RestController
public class SecurityController {

    private final securityservice securityService;

    public SecurityController(securityservice securityService) {
        this.securityService = securityService;
    }

    @GetMapping("/api/tips/{id}")
public Tip tips(@PathVariable int id) {
    return securityService.getTip(id);
}
@PostMapping("/api/scan")
public String scanURL(@RequestBody URLRequest request) {

    return "Scanning: " + request.getUrl();
}
}