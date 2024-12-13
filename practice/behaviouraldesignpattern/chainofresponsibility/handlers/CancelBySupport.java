package practice.behaviouraldesignpattern.chainofresponsibility.handlers;

import practice.behaviouraldesignpattern.chainofresponsibility.Level;
import practice.behaviouraldesignpattern.chainofresponsibility.Request;

import java.util.ArrayList;
import java.util.List;

public class CancelBySupport implements Level {

    List<String> allowedReasonsBySupport =
            List.of("Product Expired", "Damaged");

    @Override
    public String handle(Request request) {
        if(allowedReasonsBySupport
                .contains(request.getRequestDescription())) {
            return "Cancelled Successfully, " +
                    "Refund will be initiated after pickup";
        }
        return new CancelByAdmin().handle(request);
    }

}
