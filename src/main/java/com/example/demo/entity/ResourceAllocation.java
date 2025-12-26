package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ResourceAllocation {
    @Id @GeneratedValue private Long id;

    @ManyToOne private Resource resource;
    @OneToOne private ResourceRequest request;

    private Boolean conflictFlag=false;
    private String notes;
    private LocalDateTime allocatedAt = LocalDateTime.now();

    public ResourceAllocation(){}

    public void setResource(Resource r){resource=r;}
    public void setRequest(ResourceRequest r){request=r;}
    public LocalDateTime getAllocatedAt(){return allocatedAt;}
    public String getNotes(){return notes;}
    public void setNotes(String n){notes=n;}
}
