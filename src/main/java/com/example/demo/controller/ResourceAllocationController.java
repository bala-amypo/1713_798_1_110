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

    @PostMapping("/{requestId}")
    public ResourceAllocation allocate(@PathVariable Long requestId) {
        return service.allocate(requestId);
    }

    @GetMapping
    public List<ResourceAllocation> all() {
        return service.getAll();
    }
}
