package com.vaibhav.paymentservice.controller;

import com.vaibhav.paymentservice.dto.PaymentLinkRequestDto;
import com.vaibhav.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class PaymentController {
    private PaymentService paymentService;
    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping
    public String generatePaymentLink(@RequestBody PaymentLinkRequestDto requestDto)
    {
        try {
            return paymentService.generatePaymentLink(requestDto.getOrderId());
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
