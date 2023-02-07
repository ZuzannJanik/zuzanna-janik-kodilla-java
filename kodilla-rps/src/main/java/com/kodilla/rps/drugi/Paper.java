package com.kodilla.rps.drugi;

public class Paper {
    ComputerChoice computerChoice = new ComputerChoice();
    int myScore = 0;
    int computerScore = 0;

    Results results = new Results();
    public void game() {
        if (computerChoice.computerMove == 1) {
            System.out.println("You chose PAPER and computer chose ROCK");
            System.out.println("Paper beats rock. Point for YOU!");
            myScore++; //Nie wiem jak ten wynik przekazać do results
        } else if (computerChoice.computerMove == 2) {
            System.out.println("You chose PAPER and computer chose PAPER");
            System.out.println("Draw. No points");
        } else if (computerChoice.computerMove == 3) {
            System.out.println("You chose PAPER and computer chose SCISSORS");
            System.out.println("Scissors beat paper Point for Computer!");
            computerScore++; //Nie wiem jak ten wynik przekazać do results
        }
    }
}
