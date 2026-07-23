package com.cyber.cyber.model;

public class ScanResponse {

    private String status;
    private String message;
    private int riskScore;

    public ScanResponse(String status, String message, int riskScore) {
        this.status = status;
        this.message = message;
        this.riskScore = riskScore;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public int getRiskScore() {
        return riskScore;
    }
}