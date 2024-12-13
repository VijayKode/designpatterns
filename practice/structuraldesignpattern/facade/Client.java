package practice.structuraldesignpattern.facade;

import practice.structuraldesignpattern.facade.impl.BankImpl;

public class Client {
    public static void main(String[] args) {

        Bank bank = new BankImpl("1234567");
        bank.getCards().getCardDetails();
        bank.getDeposits().getDepositDetails();
        bank.getLoans().getLoanDetails();

    }
}
