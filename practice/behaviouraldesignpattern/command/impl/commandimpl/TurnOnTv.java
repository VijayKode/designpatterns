package practice.behaviouraldesignpattern.command.impl.commandimpl;

import lombok.RequiredArgsConstructor;
import practice.behaviouraldesignpattern.command.Command;
import practice.behaviouraldesignpattern.command.Device;

@RequiredArgsConstructor
public class TurnOnTv implements Command {
    private final Device device;
    @Override
    public void execute() {
        device.turnOn();
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}
