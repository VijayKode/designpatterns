package practice.creationaldesignpattern.abstractfactory;

import practice.creationaldesignpattern.abstractfactory.BankFactory;
import practice.creationaldesignpattern.abstractfactory.MoneyDepositFactory;
import practice.creationaldesignpattern.factory.LoanFactory;

public class ClientWithAbstractFactoryPattern {

    public static void main(String[] args) {

        BankFactory bankFactory = new BankFactory();

        LoanFactory loanFactory = bankFactory.getLoanFactory();

        System.out.println(loanFactory
                .getLoan("home").interestRate());

        System.out.println(loanFactory
                .getLoan("personal").interestRate());

        MoneyDepositFactory moneyDepositFactory =
                bankFactory.getMoneyDepositFactory();

        System.out.println(moneyDepositFactory
                .getMoneyDeposit("saving").interestRate());

        System.out.println(moneyDepositFactory
                .getMoneyDeposit("fixed").interestRate());
    }
}
