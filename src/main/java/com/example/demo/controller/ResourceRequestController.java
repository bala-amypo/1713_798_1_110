// ResourceRequestController.java
package com.example.demo.controller;

import com.example.demo.entity.ResourceRequest;
import com.example.demo.service.ResourceRequestService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/requests")
public class ResourceRequestController {

    private final ResourceRequestService service;

    public ResourceRequestController(ResourceRequestService service) {
        this.service = service;
    }

    @PostMapping
    public ResourceRequest request(@RequestBody ResourceRequest request) {
        return service.createRequest(request);
    }

    @GetMapping
    public List<ResourceRequest> getAll() {
        return service.getAllRequests();
    }
}
