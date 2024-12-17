package practice.behaviouraldesignpattern.mediator.bankimpl;

import practice.behaviouraldesignpattern.mediator.Bank;

public class Icici implements Bank {

    int availableBalance = 40000;

    @Override
    public boolean requestMoney(int money) {
        return hasAvailableBalance(money);
    }

    @Override
    public boolean hasAvailableBalance(int money) {
        if(money <= availableBalance) {
            System.out.println("ICICI, Account has sufficient Balance");
            return true;
        }
        return false;
    }

}
