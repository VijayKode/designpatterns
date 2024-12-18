package practice.behaviouraldesignpattern.state;

import practice.behaviouraldesignpattern.state.impl.Play;

public class User {

    public static void main(String[] args) {
       MediaPlayerContext mediaPlayerContext = new MediaPlayerContext();
       mediaPlayerContext.setPlayerState(new Play());
       mediaPlayerContext.execute();
    }
}
