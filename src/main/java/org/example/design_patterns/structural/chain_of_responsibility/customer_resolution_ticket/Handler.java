package org.example.design_patterns.structural.chain_of_responsibility.customer_resolution_ticket;

import org.example.design_patterns.structural.chain_of_responsibility.customer_resolution_ticket.models.Request;

public abstract class Handler {
    private final Handler next;

    public Handler(Handler next) {
        this.next = next;
    }
    public void passToNextHandler(Request request) {
        if(next != null){
            next.handle(request);
        }
    }
    public abstract void handle(Request request);
}
