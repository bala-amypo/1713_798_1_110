package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class ResourceRequest {

    @Id
    @GeneratedValue
    private Long id;

    private String resourceType;
    private String status;

    @ManyToOne
    private User requestedBy;

    public Long getId() { return id; }
    public String getResourceType() { return resourceType; }
    public String getStatus() { return status; }
    public User getRequestedBy() { return requestedBy; }

    public void setResourceType(String resourceType) { this.resourceType = resourceType; }
    public void setStatus(String status) { this.status = status; }
    public void setRequestedBy(User requestedBy) { this.requestedBy = requestedBy; }
}
