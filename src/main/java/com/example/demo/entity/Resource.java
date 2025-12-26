package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Resource {
    @Id @GeneratedValue private Long id;
    @Column(unique=true) private String resourceName;
    private String resourceType;
    private Integer capacity;
    private String location;

    public Resource(){}

    // getters/setters
    public Long getId(){return id;}
    public String getResourceName(){return resourceName;}
    public void setResourceName(String r){resourceName=r;}
    public String getResourceType(){return resourceType;}
    public void setResourceType(String r){resourceType=r;}
    public Integer getCapacity(){return capacity;}
    public void setCapacity(Integer c){capacity=c;}
}
