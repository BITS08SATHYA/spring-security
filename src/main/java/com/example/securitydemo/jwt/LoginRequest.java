package com.example.securitydemo.jwt;

import lombok.*;

@Getter@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {
    private String username;
    private String password;
}
