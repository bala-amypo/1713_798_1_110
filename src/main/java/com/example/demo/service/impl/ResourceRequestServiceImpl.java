package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.service.ResourceRequestService;

public class ResourceRequestServiceImpl implements ResourceRequestService {

    private final ResourceRequestRepository repo;
    private final UserRepository userRepo;

    public ResourceRequestServiceImpl(ResourceRequestRepository repo, UserRepository userRepo) {
        this.repo = repo;
        this.userRepo = userRepo;
    }

    public ResourceRequest createRequest(Long userId, ResourceRequest r) {
        User u = userRepo.findById(userId).orElseThrow();
        r.setRequestedBy(u);
        return repo.save(r);
    }

    public ResourceRequest updateRequestStatus(Long id, String status) {
        ResourceRequest r = repo.findById(id).orElseThrow();
        r.setStatus(status);
        return repo.save(r);
    }
}
