package practice.creationaldesignpattern.abstractfactory;

import practice.creationaldesignpattern.abstractfactory.depositTypes.FixedDeposit;
import practice.creationaldesignpattern.abstractfactory.depositTypes.SavingDeposit;

public class MoneyDepositFactory {

    private MoneyDeposit moneyDeposit;

    public MoneyDeposit getMoneyDeposit(String depositType) {

        if(depositType.equals("saving")) {
            moneyDeposit = new SavingDeposit();

        } else if(depositType.equals("fixed")) {
            moneyDeposit = new FixedDeposit();

        } else {
            throw new RuntimeException("InValid depositType");
        }
        return  moneyDeposit;
    }
}
