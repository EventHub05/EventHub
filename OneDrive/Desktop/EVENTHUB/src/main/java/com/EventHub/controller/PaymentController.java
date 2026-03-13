package com.EventHub.controller;



import com.EventHub.dto.PaymentRequestDTO;
import com.EventHub.dto.PaymentResponseDTO;
import com.EventHub.service.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/pay")
    public PaymentResponseDTO makePayment(@RequestBody PaymentRequestDTO request){

        return paymentService.processPayment(request);

    }
}