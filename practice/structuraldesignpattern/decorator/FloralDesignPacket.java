package practice.structuraldesignpattern.decorator;

public class FloralDesignPacket extends GiftPacker{

    public FloralDesignPacket(Package pack) {
        super(pack);
    }
    @Override
    public void pack() {
        pack.pack();
        System.out.println("Package is decorated with Floral gift cover");
    }
}
