package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class User {
    @Id @GeneratedValue
    private Long id;
    private String fullName;

    @Column(unique = true)
    private String email;

    private String role = "USER";
    private LocalDateTime createdAt = LocalDateTime.now();

    // getters/setters
}
