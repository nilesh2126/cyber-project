package com.cyber.cyber.service;
import java.util.Map;
import java.util.HashMap;
import com.cyber.cyber.model.Tip;
import org.springframework.stereotype.Service;
import com.cyber.cyber.model.ScanResponse;
import com.cyber.cyber.model.URLRequest;
import com.cyber.cyber.model.PasswordRequest;
import com.cyber.cyber.model.passwordResponse;
@Service
public class securityservice {
   public Tip getTip(int id) {

    if (id == 1) {
        return new Tip(
                "Password Security",
                "Use strong and unique passwords.",
                "High");
    }

    else if (id == 2) {
        return new Tip(
                "Phishing",
                "Never click suspicious links.",
                "Medium");
    }

    else {
        return new Tip(
                "Unknown",
                "No tip found.",
                "None");
    }
}

public ScanResponse scanURL(URLRequest request)
{
    String url = request.getUrl().toLowerCase();
    int riskScore = 0;
    if(url.startsWith("http://")){
        riskScore +=30;
    }
    if(url.contains("free"))
    {
        riskScore+=20;
    }
    if(url.contains("login")){
        riskScore+=20;  
    }
    if(url.contains("money")){
        riskScore+=20;
    }
    if(url.contains(".xyz")){
        riskScore+=10;
    }
    if(url.length() > 50){
        riskScore+=10;
    }
    String status;
    String message;
    if(riskScore >= 50)
    {
        status = "DANGEROUS";
        message = "Suspecious URL detected";
    }
    else
    {
        status = "SAFE";
        message = "No majour threat detected";
    }
    return new ScanResponse(
        status,
        message,
        riskScore
    );
}
    public passwordResponse checkPassword(PasswordRequest request)
    {
        String password = request.getPassword();
        int score = 0;
        if (password.length() >= 8) {
        score += 20;
    }

    if (password.matches(".*[A-Z].*")) {
        score += 20;
    }

    if (password.matches(".*[a-z].*")) {
        score += 20;
    }

    if (password.matches(".*\\d.*")) {
        score += 20;
    }

    if (password.matches(".*[!@#$%^&*()].*")) {
        score += 20;
    }

    String strength;
    if(score >= 80)
    {
        strength = "Strong";
    }
    else if(score >= 60)
    {
        strength = "medium";
    }
    else
    {
        strength = "low";
    }
    return new passwordResponse(strength, score, "Password Analysis completed");
    }
}