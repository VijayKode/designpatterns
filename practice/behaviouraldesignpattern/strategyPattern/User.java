package practice.behaviouraldesignpattern.strategyPattern;

import practice.behaviouraldesignpattern.strategyPattern.impl.BuyThroughCash;

public class User {

        public static void main(String[] args) {
            PurchaseContext purchaseContext =
                    new PurchaseContext();
            purchaseContext.setStrategy(new BuyThroughCash());
            purchaseContext.purchase();
        }
}
