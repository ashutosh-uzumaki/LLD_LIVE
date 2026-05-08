package org.example.design_patterns.structural.chain_of_responsibility.customer_resolution_ticket;

import org.example.design_patterns.structural.chain_of_responsibility.customer_resolution_ticket.models.Request;
import org.example.design_patterns.structural.chain_of_responsibility.customer_resolution_ticket.models.RequestType;

public class ChatBotHandler extends Handler {
    public ChatBotHandler(Handler handler) {
        super(handler);
    }
    public void handle(Request request) {
        if(request.getRequestType() == RequestType.FAQ || request.getRequestType() == RequestType.ORDER_STATUS){
            System.out.println("ChatBotHandler handle request: "+request.getRequestType());
        }else{
            passToNextHandler(request);
        }
    }
}
