package com.kodilla.rps;

import java.util.Random;

public class ComputerChoice {
    Random random = new Random();
    int computerMove = random.nextInt(2)+1;
    public void ComputerChoice() {
    switch (computerMove) {
        case 1:
            System.out.println("You chose ROCK!");
            break;
        case 2:
            System.out.println("You chose PAPER!");
            break;
        case 3:
            System.out.println("You chose SCISSORS");
            break;
    }
    }
}
