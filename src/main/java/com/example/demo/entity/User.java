package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class User {
    @Id @GeneratedValue private Long id;
    private String fullName;
    @Column(unique = true) private String email;
    private String password;
    private String role = "USER";
    private LocalDateTime createdAt = LocalDateTime.now();

    public User(){}
    public User(String f,String e,String p,String r){fullName=f;email=e;password=p;role=r;}

    // getters/setters
    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}
    public String getEmail(){return email;}
    public void setEmail(String e){email=e;}
    public String getPassword(){return password;}
    public void setPassword(String p){password=p;}
    public String getRole(){return role;}
    public void setRole(String r){role=r;}
    public String getFullName(){return fullName;}
    public void setFullName(String f){fullName=f;}
}
