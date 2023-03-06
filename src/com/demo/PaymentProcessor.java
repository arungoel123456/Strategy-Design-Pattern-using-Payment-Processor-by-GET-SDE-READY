package com.demo;

public class PaymentProcessor {
    public void processCreditCardPayment( String cardNum, String cvv, String expiryDate, double amount ){
        // processing
        System.out.println("In credit card payment");
    }

    public void processPaypalPayment(String email, String password, double amount){
        // process payment
        System.out.println("In Paypal payment");
    }

    public void processStripePayment(String apiKey, double amount){
        // process payment;
        System.out.println("In Stripe payment");
    }

}
