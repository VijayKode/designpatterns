package practice.creationaldesignpattern.abstractfactory.depositTypes;

import practice.creationaldesignpattern.abstractfactory.MoneyDeposit;

public class SavingDeposit implements MoneyDeposit {
    @Override
    public double interestRate() {
        return 4.00;
    }
}
