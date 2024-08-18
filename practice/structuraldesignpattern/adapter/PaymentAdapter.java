package practice.structuraldesignpattern.adapter;

public class PaymentAdapter implements Payment {
    GenericBillPayment genericBillPayment =  new GenericBillPayment();
    @Override
    public void pay() {
        genericBillPayment.payElectricityBill();
    }
}
