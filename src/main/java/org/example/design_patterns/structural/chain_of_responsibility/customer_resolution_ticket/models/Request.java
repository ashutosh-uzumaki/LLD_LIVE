package org.example.design_patterns.structural.chain_of_responsibility.customer_resolution_ticket.models;

public class Request {
    private final String id;
    private final RequestType requestType;
    private final String customerId;
    private final String message;

    public Request(String id, RequestType requestType, String customerId, String message) {
        this.id = id;
        this.requestType = requestType;
        this.customerId = customerId;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getMessage() {
        return message;
    }
}
