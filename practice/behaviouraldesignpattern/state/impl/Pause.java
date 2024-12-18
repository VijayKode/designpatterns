package practice.behaviouraldesignpattern.state.impl;

import practice.behaviouraldesignpattern.state.PlayerState;

public class Pause implements PlayerState {
    @Override
    public void runState() {
        System.out.println("Pause the video");
    }
}
