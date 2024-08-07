package practice.creationaldesignpattern.factory;

import practice.creationaldesignpattern.factory.loantypes.HomeLoan;
import practice.creationaldesignpattern.factory.loantypes.PersonalLoan;

public class LoanFactory {

    public Loan getLoan(String loanType) {

        if ("home".equals(loanType)) {
            return new HomeLoan();
        } else if ("personal".equals(loanType)) {
            return new PersonalLoan();
        } else {
            throw new RuntimeException("Loan type not valid");
        }


    }

}
