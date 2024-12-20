package practice.behaviouraldesignpattern.template;

public class Home extends ConstructBuilding{

    @Override
    void layFoundation() {
        System.out.println(" Foundation is completed");
    }

    @Override
    void constructPillars() {
        System.out.println(" Pillars are completed");
    }

    @Override
    void constructSlab() {
        System.out.println(" Slab is completed");
    }
}
