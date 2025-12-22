package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.dto.*;
import com.example.demo.security.JwtUtil;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtUtil jwt=new JwtUtil("secret",3600000);

    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest r){
        return new AuthResponse(jwt.generateToken(1L,r.email,"USER"));
    }
}
