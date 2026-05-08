package org.example.design_patterns.creational.factory;

public class UpiPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new UpiPayment();
    }
}
