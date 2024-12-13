package practice.behaviouraldesignpattern.chainofresponsibility;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Order {

    String status;
    String paymentOption;
    String customerId;
}
