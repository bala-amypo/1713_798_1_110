// ResourceRequestService.java
package com.example.demo.service;

import com.example.demo.entity.ResourceRequest;
import java.util.List;

public interface ResourceRequestService {
    ResourceRequest createRequest(ResourceRequest request);
    List<ResourceRequest> getAllRequests();
}
