package com.example.demo.entity;

import jakarta.persistence.*;

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

    public void setResource(Resource resource) { this.resource = resource; }
    public void setRequest(ResourceRequest request) { this.request = request; }
    public void setConflictFlag(boolean conflictFlag) { this.conflictFlag = conflictFlag; }
}
