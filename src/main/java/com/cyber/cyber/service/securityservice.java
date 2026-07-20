package com.cyber.cyber.service;
import java.util.Map;
import java.util.HashMap;
import com.cyber.cyber.model.Tip;
import org.springframework.stereotype.Service;
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
}
