package com.example.securitydemo.jwt;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
public class LoginResponse {

    private String jwtToken;
    private String username;
    private List<String> roles;

    public LoginResponse(String username, List<String> roles) {
        this.username = username;
        this.roles = roles;
    }
}
