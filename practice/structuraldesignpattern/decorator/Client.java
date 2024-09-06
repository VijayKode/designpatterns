package practice.structuraldesignpattern.decorator;

public class Client {

    public static void main(String[] args) {
        Package aPackage = new PackedProduct();
        Package giftPackage = new FloralDesignPacket(aPackage);
        giftPackage.pack();
    }
}
