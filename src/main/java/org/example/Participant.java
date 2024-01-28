package org.example;

public class Participant {
       private final int maxRun;
    private final int maxJump;

    public Participant(java.lang.String string, int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }
}
