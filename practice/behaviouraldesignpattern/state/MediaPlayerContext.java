package practice.behaviouraldesignpattern.state;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MediaPlayerContext {
     private PlayerState playerState;

     void execute() {
         playerState.runState();
     }
}
