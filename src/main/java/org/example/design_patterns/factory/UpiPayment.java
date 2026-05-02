package org.example.design_patterns.factory;

public class UpiPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("UpiPayment is executed");
    }
}
