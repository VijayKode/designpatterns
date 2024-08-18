package practice.creationaldesignpattern.abstractfactory.depositTypes;

import practice.creationaldesignpattern.abstractfactory.MoneyDeposit;

public class FixedDeposit implements MoneyDeposit {
    @Override
    public double interestRate() {
        return 7.00;
    }
}
