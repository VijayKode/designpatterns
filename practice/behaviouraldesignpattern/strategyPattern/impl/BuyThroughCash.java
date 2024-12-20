package practice.behaviouraldesignpattern.strategyPattern.impl;

import practice.behaviouraldesignpattern.strategyPattern.Strategy;

public class BuyThroughCash implements Strategy {
    @Override
    public void buy() {
        System.out.println("Bought through cash");
    }
}
