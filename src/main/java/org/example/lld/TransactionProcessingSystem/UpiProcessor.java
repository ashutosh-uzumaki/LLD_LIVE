package org.example.lld.TransactionProcessingSystem;

import java.math.BigDecimal;

public class UpiProcessor implements PaymentProcessor {
    @Override
    public void pay(BigDecimal amount){
        System.out.println("Upi payment of " + amount.toPlainString()+" processed via upi");
    }
}
