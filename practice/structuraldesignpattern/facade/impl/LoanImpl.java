package practice.structuraldesignpattern.facade.impl;

import practice.structuraldesignpattern.facade.Loan;

public class LoanImpl implements Loan {

    private final String customerNumber;

    public LoanImpl(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Override
    public String getLoanDetails() {
        System.out.println("Loan for this customer " +
                ""+customerNumber+" are home,personal");
        return "Loan for this customer are home,personal";
    }
}
