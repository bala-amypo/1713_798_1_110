package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ResourceAllocation {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Resource resource;

    @OneToOne
    private ResourceRequest request;

    private LocalDateTime allocatedAt;
    private Boolean conflictFlag = false;
    private String notes;

    @PrePersist
    void init() {
        allocatedAt = LocalDateTime.now();
    }

    // getters & setters
    public Long getId() { return id; }

    public Resource getResource() { return resource; }
    public void setResource(Resource resource) { this.resource = resource; }

    public ResourceRequest getRequest() { return request; }
    public void setRequest(ResourceRequest request) { this.request = request; }
}
