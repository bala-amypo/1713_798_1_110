package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class AllocationRule {

    @Id @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String ruleName;

    private String ruleType;
    private Integer priorityWeight;
    private LocalDateTime createdAt = LocalDateTime.now();

    // getters & setters
}
