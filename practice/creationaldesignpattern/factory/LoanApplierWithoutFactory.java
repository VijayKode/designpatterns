package practice.creationaldesignpattern.factory;

import practice.creationaldesignpattern.factory.loantypes.HomeLoan;
import practice.creationaldesignpattern.factory.loantypes.PersonalLoan;

public class LoanApplierWithoutFactory {

    public static void main(String[] args) {

        Loan homeLoan  = new HomeLoan();
        System.out.println(homeLoan.interestRate());

        Loan personalLoan  = new PersonalLoan();
        System.out.println(personalLoan.interestRate());

    }
}
