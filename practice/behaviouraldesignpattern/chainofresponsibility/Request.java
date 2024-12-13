package practice.behaviouraldesignpattern.chainofresponsibility;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Request {
    String requestType;
    Order order;
    String requestDescription;
}
