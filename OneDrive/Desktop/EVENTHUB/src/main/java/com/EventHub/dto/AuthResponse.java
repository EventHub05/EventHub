package com.EventHub.dto;

public class AuthResponse {

    private String message;
    private String status;

    // Constructor
    public AuthResponse(String message, String status) {
        this.message = message;
        this.status = status;
    }

    // Getter
    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }

    // Setter
    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}