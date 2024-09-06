package practice.structuraldesignpattern.decorator;

public abstract class GiftPacker implements Package{
    public final Package pack;

    protected GiftPacker(Package pack) {
        this.pack = pack;
    }
}
