package practice.structuraldesignpattern.adapter;

public class ElectricityPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("paid electricityBill");
    }
}
