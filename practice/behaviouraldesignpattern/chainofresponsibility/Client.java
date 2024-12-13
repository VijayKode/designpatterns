package practice.behaviouraldesignpattern.chainofresponsibility;

import practice.behaviouraldesignpattern.chainofresponsibility.handlers.CancelByApp;

public class Client {

    public static void main(String[] args) {

        Request request = new Request();
        request.setRequestType("cancel");
        request.setRequestDescription("Not wanted");
        request.setOrder(Order.builder()
                        .customerId("12345")
                        .paymentOption("paid")
                        .status("delivered")
                .build());

        System.out.println(new CancelByApp().handle(request));
    }
}
