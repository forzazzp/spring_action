package com.springaction.knights;

import java.io.PrintStream;

public class Minstrel {

    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest() {
        System.out.println("before quest!");
    }

    public void singAfterQuest() {
        System.out.println("after quest!");
    }
}
