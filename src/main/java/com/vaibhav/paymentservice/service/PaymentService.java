package com.vaibhav.paymentservice.service;

import com.stripe.exception.StripeException;
import com.vaibhav.paymentservice.paymentgateway.PaymentGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private PaymentGateway paymentGateway;
    @Autowired
    public PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String generatePaymentLink(Long orderId) throws Exception {
        // Ideally I should call order service api and get all payment related and customer related information
        // and enter all the credentials in below method.
        return paymentGateway.generatePaymentLink(10000L,"asjbdbhj","asiudguiu");
    }
}
