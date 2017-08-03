package com.soundsystem;

import org.springframework.stereotype.Component;

@Component("beatlesMusic")
public class SgtPeppers implements CompactDisc {

    private String title = "sgt music!";

    private String artist = "The Beatles!";
    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
