package com.example.demo.service;

import com.example.demo.entity.ResourceAllocation;
import java.util.List;

public interface ResourceAllocationService {
    ResourceAllocation allocate(Long requestId);
    List<ResourceAllocation> getAll();
}
