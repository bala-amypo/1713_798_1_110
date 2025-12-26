package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.*;
import com.example.demo.service.ResourceRequestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceRequestServiceImpl implements ResourceRequestService {

    private final ResourceRequestRepository reqRepo;
    private final UserRepository userRepo;

    public ResourceRequestServiceImpl(ResourceRequestRepository r, UserRepository u) {
        reqRepo = r;
        userRepo = u;
    }

    public ResourceRequest createRequest(Long userId, ResourceRequest req) {
        User user = userRepo.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));

        if (req.getStartTime().isAfter(req.getEndTime()))
            throw new IllegalArgumentException();

        req.setRequestedBy(user);
        req.setStatus("PENDING");
        return reqRepo.save(req);
    }

    public List<ResourceRequest> getRequestsByUser(Long userId) {
        return reqRepo.findByRequestedBy_Id(userId);
    }

    public ResourceRequest getRequest(Long id) {
        return reqRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Request not found"));
    }

    public ResourceRequest updateRequestStatus(Long id, String status) {
        ResourceRequest r = getRequest(id);
        r.setStatus(status);
        return reqRepo.save(r);
    }
}
