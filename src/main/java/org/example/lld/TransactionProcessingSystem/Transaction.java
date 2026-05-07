package org.example.lld.TransactionProcessingSystem;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private final String transactionId;
    private final String customerId;
    private final BigDecimal amount;
    private final String currency;
    private final String notes;
    private final LocalDateTime timestamp;

    private Transaction(TransactionBuilder builder){
        this.transactionId = builder.transactionId;
        this.customerId = builder.customerId;
        this.amount = builder.amount;
        this.currency = builder.currency;
        this.notes = builder.notes;
        this.timestamp = builder.timestamp;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", notes='" + notes + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

    public static class TransactionBuilder {
        private final String transactionId;
        private final String customerId;
        private final BigDecimal amount;
        private String currency;
        private String notes;
        private LocalDateTime timestamp;

        public TransactionBuilder(String transactionId, String customerId, BigDecimal amount) {
            this.transactionId = transactionId;
            this.customerId = customerId;
            this.amount = amount;
        }

        public TransactionBuilder setCurrency(String currency) {
            this.currency = currency;
            return this;
        }

        public TransactionBuilder setNotes(String notes) {
            this.notes = notes;
            return this;
        }

        public TransactionBuilder setTimestamp(LocalDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Transaction build(){
            return new Transaction(this);
        }
    }
}
