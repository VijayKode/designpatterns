package practice.structuraldesignpattern.bridge.bank.impl;

import practice.structuraldesignpattern.bridge.bank.Bank;

public class Icici extends Bank {

    @Override
    public String getBankName() {
        return "ICICI";
    }

    @Override
    public double getInterestRate(String loanType) {
        if(loanType.equals("personal")) {
            return 9.50;
        } else if(loanType.equals("home")) {
            return 7.50;
        }
        return -1;
    }

}
