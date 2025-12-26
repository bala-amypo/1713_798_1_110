package com.example.demo.dto;

public class RegisterRequest {
    private String fullName;
    private String email;
    private String password;
    private String role;

    public String getFullName() { return fullName; }
    public void setFullName(String f) { fullName = f; }
    public String getEmail() { return email; }
    public void setEmail(String e) { email = e; }
    public String getPassword() { return password; }
    public void setPassword(String p) { password = p; }
    public String getRole() { return role; }
    public void setRole(String r) { role = r; }
}
