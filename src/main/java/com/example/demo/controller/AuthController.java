package com.example.demo.controller;

import com.example.demo.security.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtUtil jwtUtil =
            new JwtUtil("test-secret-key-that-is-long-enough-1234", 3600000);

    @PostMapping("/login")
    public String login() {
        Long userId = 1L;
        String username = "admin";
        String role = "ROLE_ADMIN";

        return jwtUtil.generateToken(userId, username, role);
    }
}
