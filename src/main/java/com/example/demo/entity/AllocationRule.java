package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class AllocationRule {
    @Id @GeneratedValue private Long id;
    @Column(unique=true) private String ruleName;
    private String ruleType;
    private Integer priorityWeight=0;

    public AllocationRule(){}

    public void setRuleName(String r){ruleName=r;}
    public String getRuleName(){return ruleName;}
    public void setRuleType(String r){ruleType=r;}
    public String getRuleType(){return ruleType;}
    public void setPriorityWeight(Integer p){priorityWeight=p;}
    public Integer getPriorityWeight(){return priorityWeight;}
}
