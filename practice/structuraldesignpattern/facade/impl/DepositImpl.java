package practice.structuraldesignpattern.facade.impl;

import practice.structuraldesignpattern.facade.Deposit;

public class DepositImpl implements Deposit {

    private final String customerNumber;

    public DepositImpl(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Override
    public String getDepositDetails() {
        System.out.println("Deposit for this customer " +
                ""+customerNumber+" is only saving type");
        return "Deposit for this customer " +
                ""+customerNumber+" is only saving type";
    }
}
