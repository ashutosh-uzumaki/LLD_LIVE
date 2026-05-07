package org.example.lld.TransactionProcessingSystem;

import java.math.BigDecimal;

public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void pay(BigDecimal amount){
        System.out.println("Payment of " + amount.toPlainString()+" processed via credit card");
    }
}
