package practice.behaviouraldesignpattern.command.impl.commandimpl;

import lombok.RequiredArgsConstructor;
import practice.behaviouraldesignpattern.command.Command;
import practice.behaviouraldesignpattern.command.Device;
import practice.behaviouraldesignpattern.command.impl.deviceImpl.TvWithVolume;

@RequiredArgsConstructor
public class MuteTvVolume implements Command {
    
    private final TvWithVolume device;

    @Override
    public void execute() {
        device.mute();
    }

    @Override
    public void undo() {
        device.unMute();
    }

    @Override
    public void redo() {
        device.mute();
    }
}
