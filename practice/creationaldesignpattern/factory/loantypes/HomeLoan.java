package practice.creationaldesignpattern.factory.loantypes;

import practice.creationaldesignpattern.factory.Loan;

public class HomeLoan implements Loan {
    @Override
    public double interestRate() {
        return 7.00;
    }
}
