package com.EventHub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EventHub.Repository.UserRepository;
import com.EventHub.entity.User;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Signup
    public User signup(User user) {
        return userRepository.save(user);
    }

    // Login
    public User login(String email, String password) {

        User user = userRepository.findByEmail(email);

        if (user != null && user.getPassword().equals(password)) {
            return user;
        }

        return null;
    }
}