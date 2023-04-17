package com.caseone.caseone.controller;

public class ParkingController {
    private String licenseLate;
    private String color;
    private String entryTrue;

    public ParkingController(String licenseLate, String color) {
        this.licenseLate = licenseLate;
        this.color = color;
    }

    public String getLicenseLate() {
        return licenseLate;
    }

    public void setLicenseLate(String licenseLate) {
        this.licenseLate = licenseLate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEntryTrue() {
        return entryTrue;
    }

    public void setEntryTrue(String entryTrue) {
        this.entryTrue = entryTrue;
    }
}
