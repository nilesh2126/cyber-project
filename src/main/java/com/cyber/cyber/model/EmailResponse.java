package com.cyber.cyber.model;

public class EmailResponse {

    private String risk;
    private int score;
    private String message;

    public EmailResponse(String risk, int score, String message) {
        this.risk = risk;
        this.score = score;
        this.message = message;
    }

    public String getRisk() {
        return risk;
    }

    public int getScore() {
        return score;
    }

    public String getMessage() {
        return message;
    }
}