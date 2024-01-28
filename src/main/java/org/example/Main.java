package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Participant[] participants = {new Participant("Участник 1", 100, 30), new Participant("Участник 2", 150, 20)};
        Obstacle[] obstacles = {new RunningTrack(80), new Wall(25)};

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.pass(participant)) {
                    System.out.println(participant.getName() + " не смог пройти " + obstacle);
                    break;
                }
            }
        }
    }
}