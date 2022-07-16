package com.example.loggingCheck.model;

import org.springframework.beans.factory.annotation.Autowired;

public class JwtResponse {

    @Autowired
    String token;

    public JwtResponse() {
    }

    public JwtResponse(String token) {

        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
