package org.example.lld.TransactionProcessingSystem;

import java.math.BigDecimal;

public class TransactionProcessingSystemDemo {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = PaymentProcessorFactory.getPaymentProcessor("Upi");
        TransactionLogger logger = TransactionLogger.getInstance();
        Transaction transaction = new Transaction.TransactionBuilder("124", "123", BigDecimal.valueOf(1000)).build();
        paymentProcessor.pay(new BigDecimal(1000));
        logger.log("Transaction: " + transaction.toString());
    }
}
