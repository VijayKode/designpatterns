package practice.creationaldesignpattern.abstractfactory;

import practice.creationaldesignpattern.factory.LoanFactory;

public interface Bank {
    LoanFactory getLoanFactory();
    MoneyDepositFactory getMoneyDepositFactory();

}
