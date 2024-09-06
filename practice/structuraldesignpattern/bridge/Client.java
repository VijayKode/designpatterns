package practice.structuraldesignpattern.bridge;

import practice.structuraldesignpattern.bridge.bank.impl.Hdfc;
import practice.structuraldesignpattern.bridge.bank.impl.Icici;
import practice.structuraldesignpattern.bridge.loan.Loan;
import practice.structuraldesignpattern.bridge.loan.impl.HomeLoan;
import practice.structuraldesignpattern.bridge.loan.impl.PersonalLoan;

public class Client {

    public static void main(String[] args) {
        Loan loan = new PersonalLoan(new Hdfc());
        loan.getLoan(100000, 1);

        Loan loan4 = new HomeLoan(new Icici());
        loan4.getLoan(100000, 1);
    }
}
