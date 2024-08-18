package practice.creationaldesignpattern.abstractfactory;

import practice.creationaldesignpattern.factory.Loan;
import practice.creationaldesignpattern.factory.LoanFactory;

public class Client {
    public static void main(String[] args) {
        MoneyDepositFactory moneyDepositFactory =
                new MoneyDepositFactory();

        MoneyDeposit savingDeposit = moneyDepositFactory
                .getMoneyDeposit("saving");
        System.out.println(savingDeposit.interestRate());

        MoneyDeposit fixedDeposit = moneyDepositFactory
                .getMoneyDeposit("fixed");
        System.out.println(fixedDeposit.interestRate());

        LoanFactory loanFactory =new LoanFactory();

        Loan homeLoan = loanFactory.getLoan("home");
        System.out.println(homeLoan.interestRate());

        Loan personalLoan = loanFactory.getLoan("personal");
        System.out.println(personalLoan.interestRate());

    }
}
