package practice.behaviouraldesignpattern.chainofresponsibility.handlers;

import practice.behaviouraldesignpattern.chainofresponsibility.Level;
import practice.behaviouraldesignpattern.chainofresponsibility.Request;

public class CancelByApp implements Level {
    @Override
    public String handle(Request request) {
        if(!request.getOrder().getStatus().equals("delivered")) {
            return "Order isCancelled, Refund is initiated";
        }
        return new CancelBySupport().handle(request);
    }

}
