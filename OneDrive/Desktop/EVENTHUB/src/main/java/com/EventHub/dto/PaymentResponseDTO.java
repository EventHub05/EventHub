package com.EventHub.dto;

public class PaymentResponseDTO {

    private String message;
    private String status;

    public PaymentResponseDTO(String message, String status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }
}