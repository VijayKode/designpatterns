package practice.behaviouraldesignpattern.strategyPattern.impl;

import practice.behaviouraldesignpattern.strategyPattern.Strategy;

public class BuyThroughGold implements Strategy {

    @Override
    public void buy() {
        System.out.println("Bought using gold");
    }
}
