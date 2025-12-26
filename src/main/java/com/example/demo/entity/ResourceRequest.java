package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ResourceRequest {
    @Id @GeneratedValue private Long id;
    private String resourceType;
    private String purpose;
    private String status = "PENDING";
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @ManyToOne private User requestedBy;

    public ResourceRequest(){}

    // getters/setters
    public String getStatus(){return status;}
    public void setStatus(String s){status=s;}
    public void setRequestedBy(User u){requestedBy=u;}
    public User getRequestedBy(){return requestedBy;}
    public void setPurpose(String p){purpose=p;}
    public String getPurpose(){return purpose;}
    public void setStartTime(LocalDateTime t){startTime=t;}
    public LocalDateTime getStartTime(){return startTime;}
    public void setEndTime(LocalDateTime t){endTime=t;}
    public LocalDateTime getEndTime(){return endTime;}
    public void setResourceType(String r){resourceType=r;}
    public String getResourceType(){return resourceType;}
}
