package practice.structuraldesignpattern.flyweight;

public class Customer {
    public static void main(String []args) {
        Account personal = AccountFactory.getAccountTemplate("personal");
        personal.create("Vijay", "male", "27");
        personal.create("Monn", "female", "25");

        Account children = AccountFactory.getAccountTemplate("children");
        children.create("Vijay", "male", "7");
    }
}
