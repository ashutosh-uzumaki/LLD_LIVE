package org.example.lld.TransactionProcessingSystem;

public class TransactionLogger {
    private static volatile TransactionLogger instance;

    private TransactionLogger() {}


    public static TransactionLogger getInstance(){
        if(instance == null){
            synchronized(TransactionLogger.class){
                if(instance == null){
                    instance = new TransactionLogger();
                }
            }
        }
        return instance;
    }

    public void log(String message){
        System.out.println(message);
    }
}
