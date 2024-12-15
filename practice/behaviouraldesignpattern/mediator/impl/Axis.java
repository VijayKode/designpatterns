package practice.behaviouraldesignpattern.mediator.impl;

import practice.behaviouraldesignpattern.mediator.Bank;

public class Axis implements Bank {
    @Override
    public int withdraw(int money) {
        return money;
    }

    @Override
    public void desposit(int money) {
        System.out.println("Axis- Money received "+ money);
    }
}
