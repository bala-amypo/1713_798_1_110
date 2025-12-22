package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.service.ResourceService;
import com.example.demo.entity.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/resources")
public class ResourceController {
    private final ResourceService s;
    public ResourceController(ResourceService s){this.s=s;}

    @PostMapping public Resource create(@RequestBody Resource r){ return s.createResource(r); }
    @GetMapping public List<Resource> all(){ return s.getAllResources(); }
    @GetMapping("/{id}") public Resource one(@PathVariable Long id){ return s.getResource(id); }
}
