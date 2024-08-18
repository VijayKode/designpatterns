package practice.creationaldesignpattern.prototype;

public class Client {
    public static void main(String args[]) {
        Transfer tfr = new CashTransfer("SBI2323","HDFC1223123", 123.00);
        // You need to sent transfer but with different amount,
        // so you need to check whether transfer allowed or not
        // because you have checked it already in first transfer,
        // we can just use clone
        Transfer tfr2 = tfr.clone();
        tfr2.setAmount(143.00);
    }
}
