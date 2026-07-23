package com.cyber.cyber.controller;

import java.util.Map;

import com.cyber.cyber.model.PasswordRequest;
import com.cyber.cyber.model.ScanResponse;
import com.cyber.cyber.model.Tip;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cyber.cyber.model.URLRequest;
import com.cyber.cyber.model.passwordResponse;
import com.cyber.cyber.service.securityservice;
import com.cyber.cyber.model.PasswordRequest;
import com.cyber.cyber.model.passwordResponse;
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
public ScanResponse scanURL(@RequestBody URLRequest request) {
    return securityService.scanURL(request);
}
@PostMapping("/api/password")
public passwordResponse checkPassword(
        @RequestBody PasswordRequest request) {
            
    return securityService.checkPassword(request);
}
}