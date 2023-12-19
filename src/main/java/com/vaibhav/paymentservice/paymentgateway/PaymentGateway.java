package com.vaibhav.paymentservice.paymentgateway;



public interface PaymentGateway {
    String generatePaymentLink(Long amount,String email,String phoneNo) throws Exception;
}
