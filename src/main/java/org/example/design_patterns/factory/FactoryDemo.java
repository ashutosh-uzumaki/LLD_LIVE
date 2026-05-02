package org.example.design_patterns.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new UpiPaymentFactory();
        Payment payment = paymentFactory.createPayment();
        payment.pay();
    }
}
