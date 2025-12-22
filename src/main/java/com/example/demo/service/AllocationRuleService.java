package com.example.demo.service;

import com.example.demo.repository.AllocationRuleRepository;
import com.example.demo.entity.AllocationRule;
import com.example.demo.exception.ValidationException;
import java.util.List;

public class AllocationRuleService {
    private final AllocationRuleRepository repo;

    public AllocationRuleService(AllocationRuleRepository repo) {
        this.repo = repo;
    }

    public AllocationRule createRule(AllocationRule r) {
        if (repo.existsByRuleName(r.getRuleName()))
            throw new ValidationException("rule exists");
        return repo.save(r);
    }

    public AllocationRule getRule(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public List<AllocationRule> getAllRules() {
        return repo.findAll();
    }
}
