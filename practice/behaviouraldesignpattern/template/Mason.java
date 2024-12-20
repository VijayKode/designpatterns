package practice.behaviouraldesignpattern.template;

public class Mason {
    public static void main(String [] args) {
        ConstructBuilding constructBuilding = new Home();
        constructBuilding.template();
    }
}
