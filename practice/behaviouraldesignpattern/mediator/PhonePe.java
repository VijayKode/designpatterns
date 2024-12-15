package practice.behaviouraldesignpattern.mediator;

public class PhonePe implements Upi{

    @Override
    public void transfer(Bank from, Bank to, int amount) {
        int money = from.withdraw(amount);
        to.desposit(amount);
    }
}
