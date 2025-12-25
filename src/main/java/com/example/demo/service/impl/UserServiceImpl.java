package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User createUser(User user) {
        user.setRole("USER");
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }
}
