package org.example.design_patterns.creational.factory;

public class CreditCardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("CreditCardPayment is executed");
    }
}
