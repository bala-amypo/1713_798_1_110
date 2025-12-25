package com.example.demo.service.impl;

import com.example.demo.entity.Resource;
import com.example.demo.repository.ResourceRepository;
import com.example.demo.service.ResourceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceServiceImpl implements ResourceService {

    private final ResourceRepository repo;

    public ResourceServiceImpl(ResourceRepository repo) {
        this.repo = repo;
    }

    @Override
    public Resource createResource(Resource r) {
        if (r.getResourceName() == null || r.getCapacity() <= 0)
            throw new RuntimeException("Invalid resource");

        if (repo.existsByResourceName(r.getResourceName()))
            throw new RuntimeException("Duplicate resource");

        return repo.save(r);
    }

    @Override
    public List<Resource> getAllResources() {
        return repo.findAll();
    }
}
