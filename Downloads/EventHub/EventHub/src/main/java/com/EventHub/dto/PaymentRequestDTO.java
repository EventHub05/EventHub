package com.EventHub.dto;

import lombok.*;



@Data
public class PaymentRequestDTO {

    private Long bookingId;
    private double amount;
    private String paymentMethod;

}