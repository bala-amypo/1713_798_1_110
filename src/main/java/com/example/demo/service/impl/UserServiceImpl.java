package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repo;
    private PasswordEncoder encoder;

    // ✅ REQUIRED FOR TestNG (1-arg constructor)
    public UserServiceImpl(UserRepository repo) {
        this.repo = repo;
        this.encoder = new BCryptPasswordEncoder();
    }

    // ✅ REQUIRED FOR Spring DI (2-arg constructor)
    public UserServiceImpl(UserRepository repo, PasswordEncoder encoder) {
        this.repo = repo;
        this.encoder = encoder;
    }

    @Override
    public User registerUser(User u) {
        if (repo.existsByEmail(u.getEmail())) {
            throw new IllegalArgumentException("exists");
        }
        if (u.getRole() == null) {
            u.setRole("USER");
        }
        u.setPassword(encoder.encode(u.getPassword()));
        return repo.save(u);
    }

    @Override
    public User getUser(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    @Override
    public User getByEmail(String email) {
        return repo.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
