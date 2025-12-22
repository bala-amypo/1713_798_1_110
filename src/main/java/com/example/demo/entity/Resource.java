package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Resource {
    @Id @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String resourceName;

    private String resourceType;
    private Integer capacity;
    private String location;
    private LocalDateTime createdAt = LocalDateTime.now();
}
