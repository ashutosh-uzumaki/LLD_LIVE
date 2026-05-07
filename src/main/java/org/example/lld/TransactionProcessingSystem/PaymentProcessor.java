package org.example.lld.TransactionProcessingSystem;

import java.math.BigDecimal;

public interface PaymentProcessor {
    void pay(BigDecimal amount);
}
