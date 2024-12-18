package practice.behaviouraldesignpattern.state.impl;

import practice.behaviouraldesignpattern.state.PlayerState;

public class Play implements PlayerState {

    @Override
    public void runState() {
        System.out.println("Playing the video");
    }
}
