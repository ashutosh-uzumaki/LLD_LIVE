package org.example.design_patterns.factory;

public class CreditCardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("CreditCardPayment is executed");
    }
}
