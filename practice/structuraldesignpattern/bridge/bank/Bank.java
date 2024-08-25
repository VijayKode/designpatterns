package practice.structuraldesignpattern.bridge.bank;


public abstract class Bank {
    public abstract String getBankName();
    public abstract double getInterestRate(String loanType);
}
