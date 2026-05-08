package org.example.design_patterns.creational.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new UpiPaymentFactory();
        Payment payment = paymentFactory.createPayment();
        payment.pay();
    }
}
