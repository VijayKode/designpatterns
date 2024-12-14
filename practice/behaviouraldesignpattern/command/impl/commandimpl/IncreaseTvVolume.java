package practice.behaviouraldesignpattern.command.impl.commandimpl;

import lombok.RequiredArgsConstructor;
import practice.behaviouraldesignpattern.command.Command;
import practice.behaviouraldesignpattern.command.Device;
import practice.behaviouraldesignpattern.command.impl.deviceImpl.TvWithVolume;

@RequiredArgsConstructor
public class IncreaseTvVolume implements Command {
    private final TvWithVolume device;

    @Override
    public void execute() {
        device.increaseVolume();
    }

    @Override
    public void undo() {
        device.decreaseVolume();
    }

    @Override
    public void redo() {
        device.increaseVolume();

    }
}
