package com.cyber.cyber.model;

public class passwordResponse {
    private String strength;
    private int score;
    private String message;
    public passwordResponse(String strength,int score,String message)
    {
        this.strength = strength;
        this.score = score;
        this.message = message;
    }
    public String getStrength(){
        return strength;
    }
    public int getScore(){
        return score;
    }
    public String getMessage(){
        return message;
    }
}
