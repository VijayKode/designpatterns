package practice.structuraldesignpattern.bridge.loan;

import practice.structuraldesignpattern.bridge.bank.Bank;

public abstract class Loan {

    protected final Bank bank;

    protected Loan(Bank bank) {
        this.bank = bank;
    }

    public abstract void getLoan(double loanAmount, double years);

}
