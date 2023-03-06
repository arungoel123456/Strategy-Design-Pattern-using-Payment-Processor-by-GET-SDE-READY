import com.demo.*;
import com.demo.paymentStrategy.*;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processCreditCardPayment("324 432 53 435", "322", "11/2/2027", 324);
        paymentProcessor.processPaypalPayment("sa@fd.com", "fd", 32);
        paymentProcessor.processStripePayment("fewr", 324);

        CreditCardPaymentStrategy creditCardPaymentStrategy= new CreditCardPaymentStrategy("324 432 53 435", "322", "11/2/2027");
        PaymentProcessorUsingStrategyPattern paymentProcessorUsingStrategyPattern= new PaymentProcessorUsingStrategyPattern(creditCardPaymentStrategy);
        paymentProcessorUsingStrategyPattern.processPayment(32);

        PaymentStrategy paymentStrategy= new PaypalPaymentStrategy("fw@efd.com", "vfd");
        paymentProcessorUsingStrategyPattern.setPaymentStrategy(paymentStrategy);
        paymentProcessorUsingStrategyPattern.processPayment(232);


    }
}