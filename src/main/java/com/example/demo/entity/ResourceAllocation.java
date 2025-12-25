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

    @ManyToOne
    private ResourceRequest request;

    private boolean conflictFlag;
    private String notes;
    private LocalDateTime allocatedAt = LocalDateTime.now();

    public Resource getResource() { return resource; }
    public String getNotes() { return notes; }
    public LocalDateTime getAllocatedAt() { return allocatedAt; }

    public void setResource(Resource resource) { this.resource = resource; }
    public void setRequest(ResourceRequest request) { this.request = request; }
    public void setConflictFlag(boolean conflictFlag) { this.conflictFlag = conflictFlag; }
    public void setNotes(String notes) { this.notes = notes; }
    public void setAllocatedAt(LocalDateTime allocatedAt) { this.allocatedAt = allocatedAt; }
}
