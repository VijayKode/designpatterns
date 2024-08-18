package practice.structuraldesignpattern.adapter;

public class ClientAfterRequirementChange {
    public static void main(String args[]) {
        Payment payment = new PaymentAdapter();
        payment.pay();
    }
}
