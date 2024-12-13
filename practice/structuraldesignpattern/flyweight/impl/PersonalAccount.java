package practice.structuraldesignpattern.flyweight.impl;


import lombok.Getter;
import lombok.Setter;
import practice.structuraldesignpattern.flyweight.Account;

@Setter
@Getter
public class PersonalAccount implements Account {
    private final String type = "personal";
    private final boolean includeCreditCard = false;
    private final boolean includeDebitCardService = true;

    @Override
    public void create(String name, String gender, String age) {
        System.out.println("creating personal account");
    }
}
