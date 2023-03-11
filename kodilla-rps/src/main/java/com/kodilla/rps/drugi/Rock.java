package com.kodilla.rps.drugi;

public class Rock extends Game{
    ComputerChoice computerChoice = new ComputerChoice();

    public int game() {
        if (computerChoice.computerMove == 1) {
            System.out.println("You chose ROCK and computer chose ROCK");
            System.out.println("Draw. No points");
        } else if (computerChoice.computerMove == 2) {
            System.out.println("You chose ROCK and computer chose PAPER");
            System.out.println("Paper beats rock. Point for computer!");
            return 2;
        } else if (computerChoice.computerMove == 3) {
            System.out.println("You chose ROCK and computer chose SCISSORS");
            System.out.println("Rock beats scissors. Point for YOU!");
            return 1;
        }
        return 0;
    }
}
