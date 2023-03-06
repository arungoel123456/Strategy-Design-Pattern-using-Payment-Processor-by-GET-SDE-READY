package com.demo;

import com.demo.paymentStrategy.*;

public class PaymentProcessorUsingStrategyPattern {
    private PaymentStrategy paymentStrategy;

    public PaymentProcessorUsingStrategyPattern(PaymentStrategy paymentStrategy){
        this.paymentStrategy= paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount)
    {
        paymentStrategy.processPayment(amount);
    }
}
