package practice.structuraldesignpattern.bridge.loan.impl;

import practice.structuraldesignpattern.bridge.bank.Bank;
import practice.structuraldesignpattern.bridge.loan.Loan;

public class HomeLoan extends Loan {

    public HomeLoan(Bank bank) {
        super(bank);
    }

    @Override
    public void getLoan(double loanAmount, double years) {
        double interestRate = bank.getInterestRate("home");
        double interestAmount = (loanAmount * years * interestRate) / 100;
        System.out.println("Bank: " +bank.getBankName()+
                " Home Loan granted, principal = "+loanAmount+
                " Total interest paid = "+ interestAmount);
    }
}
