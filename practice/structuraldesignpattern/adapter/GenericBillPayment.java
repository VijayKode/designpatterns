package practice.structuraldesignpattern.adapter;

public class GenericBillPayment implements GenericPayment{
    @Override
    public void payElectricityBill() {
        System.out.println("paid electricty bill");
    }
    @Override
    public void payCreditCardBill() {
        System.out.println("paid credit card bill");
    }
}
