package com.kodilla.rps.drugi;

public class Paper extends Game{
    ComputerChoice computerChoice = new ComputerChoice();

    public int game() {
        if (computerChoice.computerMove == 1) {
            System.out.println("You chose PAPER and computer chose ROCK");
            System.out.println("Paper beats rock. Point for YOU!");
            return 1;
        } else if (computerChoice.computerMove == 2) {
            System.out.println("You chose PAPER and computer chose PAPER");
            System.out.println("Draw. No points");
            return 0;
        } else if (computerChoice.computerMove == 3) {
            System.out.println("You chose PAPER and computer chose SCISSORS");
            System.out.println("Scissors beat paper Point for Computer!");
            return 2;
        }
        return 0;
    }
}
