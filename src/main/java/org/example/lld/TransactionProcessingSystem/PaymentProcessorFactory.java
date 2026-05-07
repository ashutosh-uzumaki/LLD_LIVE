package org.example.lld.TransactionProcessingSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PaymentProcessorFactory {
    private static final Map<String, Supplier<PaymentProcessor>> registry = new HashMap<>();
    static {
        registry.put("CREDITCARD", CreditCardProcessor::new);
        registry.put("DEBITCARD", CreditCardProcessor::new);
        registry.put("UPI", UpiProcessor::new);
    }
    public static PaymentProcessor getPaymentProcessor(String type) {
        Supplier<PaymentProcessor> supplier = registry.get(type.toUpperCase());
        if(supplier == null) {
            throw new IllegalArgumentException("Unknown payment type: " + type);
        }
        return supplier.get();
    }
}
