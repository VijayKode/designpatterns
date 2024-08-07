package practice.creationaldesignpattern.factory.loantypes;

import practice.creationaldesignpattern.factory.Loan;

public class PersonalLoan implements Loan {

    @Override
    public double interestRate() {
        return 10.00;
    }
}
