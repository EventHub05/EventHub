package com.EventHub.service;


import com.EventHub.dto.LoginRequest;
import com.EventHub.dto.RegisterRequest;
import com.EventHub.dto.AuthResponse;

public interface AuthService {

    AuthResponse register(RegisterRequest request);

    AuthResponse login(LoginRequest request);

}