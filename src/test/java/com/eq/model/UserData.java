package com.eq.model;

public class UserData {
    private String username;
    private String password;
    private String ExpectedError;

    // getters and setters
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getExpectedError() {
        return ExpectedError;
    }
    public void setExpectedError(String expectedError) {
        ExpectedError = expectedError;
    }
}
