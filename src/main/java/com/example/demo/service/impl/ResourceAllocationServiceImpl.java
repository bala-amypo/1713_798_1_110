package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.*;
import com.example.demo.service.ResourceAllocationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceAllocationServiceImpl implements ResourceAllocationService {

    private final ResourceRequestRepository reqRepo;
    private final ResourceRepository resRepo;
    private final ResourceAllocationRepository allocRepo;

    public ResourceAllocationServiceImpl(ResourceRequestRepository r,
                                         ResourceRepository re,
                                         ResourceAllocationRepository a) {
        reqRepo = r; resRepo = re; allocRepo = a;
    }

    public ResourceAllocation autoAllocate(Long requestId) {
        ResourceRequest req = reqRepo.findById(requestId)
                .orElseThrow(() -> new ResourceNotFoundException("Request not found"));

        List<Resource> list = resRepo.findByResourceType(req.getResourceType());
        if (list.isEmpty()) throw new IllegalArgumentException();

        ResourceAllocation a = new ResourceAllocation();
        a.setRequest(req);
        a.setResource(list.get(0));
        return allocRepo.save(a);
    }

    public ResourceAllocation getAllocation(Long id) {
        return allocRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Allocation not found"));
    }

    public List<ResourceAllocation> getAllAllocations() {
        return allocRepo.findAll();
    }
}
