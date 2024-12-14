package practice.behaviouraldesignpattern.command.impl.deviceImpl;

import practice.behaviouraldesignpattern.command.Volume;

public class TvWithVolume extends TV implements Volume {
    @Override
    public void increaseVolume() {
        System.out.println("Tv volume +");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Tv volume -");
    }

    @Override
    public void mute() {
        System.out.println("Tv volume X");
    }

    @Override
    public void unMute() {
        System.out.println("Tv volume unMuted");
    }
}
