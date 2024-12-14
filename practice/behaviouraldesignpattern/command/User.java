package practice.behaviouraldesignpattern.command;

import practice.behaviouraldesignpattern.command.impl.commandimpl.DecreaseTvVolume;
import practice.behaviouraldesignpattern.command.impl.deviceImpl.TvWithVolume;

public class User {

    public static void main(String[] args) {
        Alexa alexa = new Alexa();
        Command command = new DecreaseTvVolume(new TvWithVolume());
        alexa.setCommand(command);
        alexa.execute();
        alexa.undo();
    }
}
