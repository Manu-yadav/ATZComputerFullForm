package com.example.atzcomputerfullform.models;

public class AbbreviationModel {
    private String abbreviation;
    private String fullForm;
    private int colorCode;

    public AbbreviationModel() {

    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getFullForm() {
        return fullForm;
    }

    public void setFullForm(String fullForm) {
        this.fullForm = fullForm;
    }

    public int getColorCode() {
        return colorCode;
    }

    public void setColorCode(int colorCode) {
        this.colorCode = colorCode;
    }
}
