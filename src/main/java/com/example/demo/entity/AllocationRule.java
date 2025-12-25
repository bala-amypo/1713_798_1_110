package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class AllocationRule {

    @Id
    @GeneratedValue
    private Long id;

    private String ruleName;

    public String getRuleName() {
        return ruleName;
    }
}
