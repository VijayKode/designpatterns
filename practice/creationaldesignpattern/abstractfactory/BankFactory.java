package practice.creationaldesignpattern.abstractfactory;

import practice.creationaldesignpattern.factory.LoanFactory;

public class BankFactory implements Bank{

    @Override
    public LoanFactory getLoanFactory() {
        return new LoanFactory();
    }

    @Override
    public MoneyDepositFactory getMoneyDepositFactory() {
        return new MoneyDepositFactory();
    }

}
