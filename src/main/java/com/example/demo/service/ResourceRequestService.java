package com.example.demo.service;
import org.springframework.stereotype.Service;

import com.example.demo.repository.*;
import com.example.demo.entity.*;
import com.example.demo.exception.ValidationException;
import java.util.List;
@Service
public class ResourceRequestService {
    private final ResourceRequestRepository reqRepo;
    private final UserRepository userRepo;

    public ResourceRequestService(ResourceRequestRepository reqRepo, UserRepository userRepo) {
        this.reqRepo = reqRepo;
        this.userRepo = userRepo;
    }

    public ResourceRequest createRequest(Long userId, ResourceRequest r) {
        if (!r.getStartTime().isBefore(r.getEndTime()))
            throw new ValidationException("time exists");
        r.setRequestedBy(userRepo.findById(userId).orElseThrow());
        return reqRepo.save(r);
    }

    public List<ResourceRequest> getRequestsByUser(Long id) {
        return reqRepo.findByRequestedBy_Id(id);
    }

    public ResourceRequest getRequest(Long id) {
        return reqRepo.findById(id).orElseThrow();
    }

    public ResourceRequest updateRequestStatus(Long id, String status) {
        ResourceRequest r = getRequest(id);
        r.setStatus(status);
        return reqRepo.save(r);
    }
}
