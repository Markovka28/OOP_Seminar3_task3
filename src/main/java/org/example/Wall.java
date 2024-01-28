package org.example;

public class Wall extends Obstacle {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    public boolean pass(Participant participant) {
        return participant.getMaxJump() >= height;
    }

    public String toString() {
        return "Стена высотой " + height + " м";
    }
}
