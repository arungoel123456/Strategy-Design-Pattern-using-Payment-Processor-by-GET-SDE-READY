package com.demo.paymentStrategy;

public class CreditCardPaymentStrategy implements PaymentStrategy{
    private String cardNumber;
    private String cvv;
    private String expiryDate;

    public CreditCardPaymentStrategy(String cardNumber, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }


    @Override
    public void processPayment(double amount) {
        System.out.println("In credit card payment");
    }
}
