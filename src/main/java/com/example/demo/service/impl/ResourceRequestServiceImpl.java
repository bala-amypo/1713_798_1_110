package com.example.demo.service.impl;

import com.example.demo.entity.ResourceRequest;
import com.example.demo.service.ResourceRequestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceRequestServiceImpl implements ResourceRequestService {

    @Override
    public ResourceRequest createRequest(ResourceRequest request) {
        request.setStatus("PENDING");
        return request;
    }

    @Override
    public List<ResourceRequest> getAllRequests() {
        return List.of();
    }
}
