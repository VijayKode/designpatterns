package practice.structuraldesignpattern.flyweight.impl;

import lombok.Getter;
import lombok.Setter;
import practice.structuraldesignpattern.flyweight.Account;
import practice.structuraldesignpattern.flyweight.Person;

@Getter
@Setter
public class Children implements Account {
    private final String type = "joint";
    private final boolean includeCreditCard = false;
    private final boolean includeDebitCardService = true;
    private final Person parent = new Person();

    @Override
    public void create(String name, String gender, String age) {
        System.out.println("creating children account");
    }
}
