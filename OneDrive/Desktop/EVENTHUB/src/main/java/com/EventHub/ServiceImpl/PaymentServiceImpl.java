package com.EventHub.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EventHub.Repository.PaymentRepository;
import com.EventHub.dto.PaymentRequestDTO;
import com.EventHub.dto.PaymentResponseDTO;
import com.EventHub.entity.PaymentEntity;
import com.EventHub.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public PaymentResponseDTO processPayment(PaymentRequestDTO request) {

        PaymentEntity payment = new PaymentEntity();

        payment.setBookingId(request.getBookingId());
        payment.setAmount(request.getAmount());
        payment.setPaymentMethod(request.getPaymentMethod());
        payment.setPaymentStatus("SUCCESS");

        paymentRepository.save(payment);

        return new PaymentResponseDTO("Payment Successful", "SUCCESS");
    }
}