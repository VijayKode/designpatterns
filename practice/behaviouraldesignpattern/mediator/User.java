package practice.behaviouraldesignpattern.mediator;

import practice.behaviouraldesignpattern.mediator.atmimpl.AxisAtm;
import practice.behaviouraldesignpattern.mediator.bankimpl.Hdfc;
import practice.behaviouraldesignpattern.mediator.bankimpl.Icici;

public class User {

    public static void main(String[] args) {
        PaymentMediator paymentMediator = new GenericPaymentMediator();
        paymentMediator.setFrom(new Hdfc());
        Atm  atm = new AxisAtm(paymentMediator);
        atm.withdraw(2000);

        paymentMediator.setFrom(new Icici());

        atm.withdraw(3000);
    }
}
