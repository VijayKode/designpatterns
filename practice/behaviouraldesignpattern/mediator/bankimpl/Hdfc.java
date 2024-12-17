package practice.behaviouraldesignpattern.mediator.bankimpl;

import practice.behaviouraldesignpattern.mediator.Bank;

public class Hdfc implements Bank {

    int availableBalance = 20000;

    @Override
    public boolean requestMoney(int money) {
        return hasAvailableBalance(money);
    }

    @Override
    public boolean hasAvailableBalance(int money) {
        if(money <= availableBalance) {
            System.out.println("HDFC, Account has sufficient Balance");
            return true;
        }
        System.out.println("HDFC, Account has no sufficient Balance");
        return false;
    }

}
