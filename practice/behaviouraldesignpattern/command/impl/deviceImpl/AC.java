package practice.behaviouraldesignpattern.command.impl.deviceImpl;

import practice.behaviouraldesignpattern.command.Device;

public class AC implements Device {

    @Override
    public void turnOn() {
        System.out.println("Ac On");
    }

    @Override
    public void turnOff() {
        System.out.println("Ac Off");
    }
}
