package com.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

    @Autowired(required = false)
    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }
    @Override
    public void play() {
        compactDisc.play();
    }
}
