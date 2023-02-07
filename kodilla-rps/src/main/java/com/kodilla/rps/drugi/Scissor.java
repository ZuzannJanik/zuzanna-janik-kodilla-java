package com.kodilla.rps.drugi;

import com.kodilla.rps.drugi.RpsRunner;

public class Scissor {
    ComputerChoice computerChoice = new ComputerChoice();

    public void game() {
        if (computerChoice.computerMove == 1) {
            System.out.println("You chose SCISSORS and computer chose ROCK");
            System.out.println("Rock beats scissors. Point for computer!");
      //      RpsRunner.computerScore += 1;
        } else if (computerChoice.computerMove == 2) {
            System.out.println("You chose SCISSORS and computer chose PAPER");
            System.out.println("Scissors beat paper Point for YOU!");
     //       myScore += 1;
        } else if (computerChoice.computerMove == 3) {
            System.out.println("You chose SCISSORS and computer chose SCISSORS");
            System.out.println("Draw. No points");
        }
    }
}
