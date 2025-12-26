package com.example.demo.dto;

public class AuthResponse {
    private String token;
    private Long userId;
    private String email;
    private String role;

    public AuthResponse(String t, Long id, String e, String r) {
        token = t; userId = id; email = e; role = r;
    }

    public String getToken() { return token; }
    public Long getUserId() { return userId; }
    public String getEmail() { return email; }
    public String getRole() { return role; }
}
