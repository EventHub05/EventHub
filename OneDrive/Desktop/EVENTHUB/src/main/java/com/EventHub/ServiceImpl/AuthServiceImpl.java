package com.EventHub.ServiceImpl;
import org.springframework.stereotype.Service;

import com.EventHub.dto.LoginRequest;
import com.EventHub.dto.RegisterRequest;
import com.EventHub.dto.AuthResponse;
import com.EventHub.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponse register(RegisterRequest request) {

        return new AuthResponse("User Registered Successfully","SUCCESS");
    }

    @Override
    public AuthResponse login(LoginRequest request) {

        return new AuthResponse("Login Successfu","SUCCESS");
    }
}