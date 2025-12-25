package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Resource {

    @Id
    @GeneratedValue
    private Long id;

    private String resourceName;
    private String resourceType;
    private int capacity;

    public Long getId() { return id; }
    public String getResourceName() { return resourceName; }
    public String getResourceType() { return resourceType; }
    public int getCapacity() { return capacity; }

    public void setResourceName(String resourceName) { this.resourceName = resourceName; }
    public void setResourceType(String resourceType) { this.resourceType = resourceType; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
}
