package practice.structuraldesignpattern.adapter;

public class ClientBeforeRequirementChange {
    public static void main(String args[]) {
        Payment payment = new ElectricityPayment();
        payment.pay();
    }
}
