package com.kodilla.rps.pierwszy;

import java.util.Scanner;

public class RpsRunner1 {

    public static void main(String[] args) throws Exception {
        boolean end = false;
        int counter = 0;
        int myScore = 0;
        int computerScore = 0;


        Intro intro = new Intro();
        intro.intro();
        System.out.println("----------------------");


        Scanner scanner = new Scanner(System.in);
        System.out.println("How many won rounds do we play?");
        int rounds = scanner.nextInt();
        if (rounds > 0) {
            System.out.println("You want to play up to " + rounds + " rounds won? OKAY");
        } else {
            System.out.println("Select a number from 1 up");
        }
            System.out.println("----------------------");

        while (!end) {
            ComputerChoice computerChoice = new ComputerChoice();

            System.out.println("Press 1 to select ROCK");
            System.out.println("Press 2 to select PAPER");
            System.out.println("Press 3 to select SCISSORS");
            System.out.println("Press x to end game");
            System.out.println("Press n to try again");

            char choice = scanner.next().charAt(0);

            if (choice == '1') {
                if (computerChoice.computerMove == 1) {
                    System.out.println("You chose ROCK and computer chose ROCK");
                    System.out.println("Draw. No points");
                } else if (computerChoice.computerMove == 2) {
                    System.out.println("You chose ROCK and computer chose PAPER");
                    System.out.println("Paper beats rock. Point for computer!");
                    computerScore++;
                } else if (computerChoice.computerMove == 3) {
                    System.out.println("You chose ROCK and computer chose SCISSORS");
                    System.out.println("Rock beats scissors. Point for YOU!");
                    myScore++;
                }

            } else if (choice == '2') {
                if (computerChoice.computerMove == 1) {
                    System.out.println("You chose PAPER and computer chose ROCK");
                    System.out.println("Paper beats rock. Point for YOU!");
                    myScore++;
                } else if (computerChoice.computerMove == 2) {
                    System.out.println("You chose PAPER and computer chose PAPER");
                    System.out.println("Draw. No points");
                } else if (computerChoice.computerMove == 3) {
                    System.out.println("You chose PAPER and computer chose SCISSORS");
                    System.out.println("Scissors beat paper Point for Computer!");
                    computerScore++;
                }
            } else if (choice == '3') {
                if (computerChoice.computerMove == 1) {
                    System.out.println("You chose SCISSORS and computer chose ROCK");
                    System.out.println("Rock beats scissors. Point for computer!");
                    computerScore++;
                } else if (computerChoice.computerMove == 2) {
                    System.out.println("You chose SCISSORS and computer chose PAPER");
                    System.out.println("Scissors beat paper Point for YOU!");
                    myScore++;
                } else if (computerChoice.computerMove == 3) {
                    System.out.println("You chose SCISSORS and computer chose SCISSORS");
                    System.out.println("Draw. No points");
                }
            } else if (choice == 'x') {
                System.out.println("Are you sure you want to quit the game? Choose y/n");
                char quit = scanner.next().charAt(0);
                if (quit == 'y') {
                    System.out.println("Thank you for game! bye bye!");
                    end = true;
                } else {
                    System.out.println("Choose your move");
                }
            } else if (choice == 'n') {
                System.out.println("Are you sure you want to quit the current game and start a new one?? Choose y/n");
                char startNew = scanner.next().charAt(0);
                if (startNew == 'n') {
                    System.out.println("Choose your move");
                } else {
                    System.out.println("OK");
                    end = true;
                }
            } else {
                System.out.println("ERROR. WRONG CHOICE");
            }
            System.out.println("----------------------");

            if (myScore == rounds || computerScore ==rounds) {
                end = true;
            }
        }
            System.out.println("Your score is " + myScore + " points");
            System.out.println("Computer score is " + computerScore + " points");

            if (myScore > computerScore) {
                System.out.println("You WON!");
            } else if (myScore < computerScore) {
                System.out.println("You LOST");
            } else {
                System.out.println("Draw. Nobody won");
            }
        }
    }


