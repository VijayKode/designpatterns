package practice.behaviouraldesignpattern.mediator.atmimpl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import practice.behaviouraldesignpattern.mediator.Atm;
import practice.behaviouraldesignpattern.mediator.PaymentMediator;

@RequiredArgsConstructor
@Getter
@Setter
public class IciciAtm implements Atm {
    private final PaymentMediator paymentMediator;

    @Override
    public void withdraw(int amount) {
        boolean isTransferAllowed =  paymentMediator.transferRequest(amount);
        if(isTransferAllowed) {
            System.out.println("PLease collect cash: "+ amount);
        }else {
            System.out.println("Insufficient Balance");
        }
    }
}
