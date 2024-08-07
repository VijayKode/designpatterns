package practice.creationaldesignpattern.factory;

public class LoanApplier {
    public static void main(String[] args) {
        LoanFactory loanFactory = new LoanFactory();

        Loan homeLoan = loanFactory.getLoan("home");
        System.out.println(homeLoan.interestRate());

        Loan personalLoan = loanFactory.getLoan("personal");
        System.out.println(personalLoan.interestRate());


    }
}
