package practice.behaviouraldesignpattern.command;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Setter
@Getter
public class Alexa {

    public Command command;
    public Command lastCommand;

    public void execute() {
        command.execute();
        lastCommand=command;
    }

    public void undo() {
        lastCommand.undo();
        lastCommand=null;
    }

    public void redo() {
      this.execute();
    }

}
