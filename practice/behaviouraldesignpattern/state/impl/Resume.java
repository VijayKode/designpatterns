package practice.behaviouraldesignpattern.state.impl;

import practice.behaviouraldesignpattern.state.PlayerState;

public class Resume implements PlayerState {
    @Override
    public void runState() {
        System.out.println("Resume the video");
    }
}
