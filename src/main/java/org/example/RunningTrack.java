package org.example;

public class RunningTrack extends Obstacle {
    private final int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    public boolean pass(Participant participant) {
        return participant.getMaxRun() >= length;
    }

    public String toString() {
        return "Беговая дорожка длиной " + length + " м";
    }
}
