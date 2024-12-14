package practice.behaviouraldesignpattern.command.impl.deviceImpl;

import practice.behaviouraldesignpattern.command.Device;

public class TV implements Device {

    @Override
    public void turnOn() {
        System.out.println("Tv On");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv Off");
    }

}
