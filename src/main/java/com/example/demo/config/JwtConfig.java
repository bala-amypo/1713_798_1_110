package com.example.demo.config;

import com.example.demo.security.JwtUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtConfig {

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.validity}")
    private long validity;

    @Bean
    public JwtUtil jwtUtil() {
        return new JwtUtil(secret, validity);
    }
}
