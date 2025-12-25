// ResourceAllocationController.java
package com.example.demo.controller;

import com.example.demo.entity.ResourceAllocation;
import com.example.demo.service.ResourceAllocationService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/allocations")
public class ResourceAllocationController {

    private final ResourceAllocationService service;

    public ResourceAllocationController(ResourceAllocationService service) {
        this.service = service;
    }

    @PostMapping
    public ResourceAllocation allocate(@RequestParam Long requestId) {
        return service.allocateResource(requestId);
    }

    @GetMapping
    public List<ResourceAllocation> getAll() {
        return service.getAllAllocations();
    }
}
