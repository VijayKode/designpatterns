package practice.structuraldesignpattern.flyweight;

import practice.structuraldesignpattern.flyweight.impl.Children;
import practice.structuraldesignpattern.flyweight.impl.PersonalAccount;

import java.util.HashMap;
import java.util.Map;

public class AccountFactory {

    private final static Map<String,Account> accountByType= new HashMap<>();
    private AccountFactory() {
    }
    public static Account getAccountTemplate(String type) {
        Account account = accountByType.get(type);
        if( account == null) {
            if (type.equals("personal")) {
                account = new PersonalAccount();
            } else if (type.equals("children")) {
                account = new Children();
            } else {
                throw new RuntimeException("invalid type");
            }
            accountByType.put(type,account);
        }
        return account;

    }
}
