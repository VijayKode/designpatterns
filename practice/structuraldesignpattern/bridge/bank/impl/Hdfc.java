package practice.structuraldesignpattern.bridge.bank.impl;

import practice.structuraldesignpattern.bridge.bank.Bank;

public class Hdfc extends Bank {

    @Override
    public String getBankName() {
        return "HDFC";
    }

    @Override
    public double getInterestRate(String loanType) {
        if(loanType.equals("personal")) {
            return 10.00;
        } else if(loanType.equals("home")) {
            return 7.00;
        }
        return -1;
    }
}
