package practice.structuraldesignpattern.facade.impl;

import practice.structuraldesignpattern.facade.Bank;
import practice.structuraldesignpattern.facade.Card;
import practice.structuraldesignpattern.facade.Deposit;
import practice.structuraldesignpattern.facade.Loan;

public class BankImpl implements Bank {

    private final String customerNumber;

    public BankImpl(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Override
    public Loan getLoans() {
        return new LoanImpl(customerNumber);
    }

    @Override
    public Card getCards() {
        return new CardImpl(customerNumber);
    }

    @Override
    public Deposit getDeposits() {
        return new DepositImpl(customerNumber);
    }
}
