package org.example.design_patterns.factory;

public class UpiPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new UpiPayment();
    }
}
