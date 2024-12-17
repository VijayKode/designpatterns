package practice.behaviouraldesignpattern.mediator;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Setter
@Getter
public class GenericPaymentMediator implements PaymentMediator {

    private Bank from;

    @Override
    public boolean transferRequest(int amount) {
       return from.requestMoney(amount);
    }
}
