package practice.structuraldesignpattern.facade.impl;

import practice.structuraldesignpattern.facade.Card;

public class CardImpl implements Card {

    private final String customerNumber;

    public CardImpl(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Override
    public String getCardDetails() {
        System.out.println("card for this customer " +
                ""+customerNumber+" is platinum credit card");
        return "card for this customer is platinum credit card";
    }
}
