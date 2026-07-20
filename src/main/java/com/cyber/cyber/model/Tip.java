package com.cyber.cyber.model;

public class Tip {

    private String title;
    private String tip;
    private String risk;

    public Tip(String title, String tip, String risk) {
        this.title = title;
        this.tip = tip;
        this.risk = risk;
    }

    public String getTitle() {
        return title;
    }

    public String getTip() {
        return tip;
    }

    public String getRisk() {
        return risk;
    }
}