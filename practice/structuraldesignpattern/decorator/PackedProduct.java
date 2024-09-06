package practice.structuraldesignpattern.decorator;

public class PackedProduct implements Package{
    @Override
    public void pack() {
        System.out.println("Product is packed");
    }
}
