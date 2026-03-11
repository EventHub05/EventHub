package com.EventHub.service;
import com.EventHub.dto.PaymentRequestDTO;
import com.EventHub.dto.PaymentResponseDTO;

public interface PaymentService {

    PaymentResponseDTO processPayment(PaymentRequestDTO request);

}