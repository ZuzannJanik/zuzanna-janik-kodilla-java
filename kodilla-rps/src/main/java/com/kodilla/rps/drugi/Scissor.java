package com.kodilla.rps.drugi;

import com.kodilla.rps.drugi.RpsRunner;

public class Scissor extends Game{
    ComputerChoice computerChoice = new ComputerChoice();

    public int game() {
        if (computerChoice.computerMove == 1) {
            System.out.println("You chose SCISSORS and computer chose ROCK");
            System.out.println("Rock beats scissors. Point for computer!");
            return 2;
        } else if (computerChoice.computerMove == 2) {
            System.out.println("You chose SCISSORS and computer chose PAPER");
            System.out.println("Scissors beat paper Point for YOU!");
            return 1;
        } else if (computerChoice.computerMove == 3) {
            System.out.println("You chose SCISSORS and computer chose SCISSORS");
            System.out.println("Draw. No points");
        }
        return 0;
    }
}
