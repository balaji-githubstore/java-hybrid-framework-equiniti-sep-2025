package com.eq.model;

import java.util.List;

public class TestData {
    private String browser;
    private List<UserData> validData;
    private List<List<String>> validData1; // array-of-arrays

    // getters and setters
    public String getBrowser() {
        return browser;
    }
    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public List<UserData> getValidData() {
        return validData;
    }
    public void setValidData(List<UserData> validData) {
        this.validData = validData;
    }

    public List<List<String>> getValidData1() {
        return validData1;
    }
    public void setValidData1(List<List<String>> validData1) {
        this.validData1 = validData1;
    }
}
