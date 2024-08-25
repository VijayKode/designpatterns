package practice.structuraldesignpattern.bridge.loan.impl;


import practice.structuraldesignpattern.bridge.bank.Bank;
import practice.structuraldesignpattern.bridge.loan.Loan;

public class PersonalLoan extends Loan {

    public PersonalLoan(Bank bank) {
        super(bank);
    }

    @Override
    public void getLoan(double loanAmount, double years) {
        double interestRate = bank.getInterestRate("personal");
        double interestAmount = (loanAmount * years * interestRate) / 100;
        System.out.println("Bank: "+bank.getBankName()+" Personal Loan granted, principal = "+loanAmount+" Total interest paid = "+ interestAmount);
    }
}
