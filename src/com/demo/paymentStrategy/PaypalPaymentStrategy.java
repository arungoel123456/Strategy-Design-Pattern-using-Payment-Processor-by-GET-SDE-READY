package com.demo.paymentStrategy;

public class PaypalPaymentStrategy implements PaymentStrategy{

    private String email;
    private  String password;

    public PaypalPaymentStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("In paypal payment");
    }
}
