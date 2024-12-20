package practice.behaviouraldesignpattern.template;

public abstract class ConstructBuilding {

    final void template() {
        layFoundation();
        constructPillars();
        constructSlab();
    }

    abstract void layFoundation();
    abstract void constructPillars();
    abstract void constructSlab();
}
