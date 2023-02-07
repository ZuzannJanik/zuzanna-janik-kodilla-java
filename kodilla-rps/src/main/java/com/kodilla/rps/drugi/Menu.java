package com.kodilla.rps.drugi;

import java.util.Scanner;

public class Menu {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        RoundsSetter roundsSetter = new RoundsSetter();

        System.out.println("Press 1 to select ROCK");
        System.out.println("Press 2 to select PAPER");
        System.out.println("Press 3 to select SCISSORS");
        System.out.println("Press x to end game");
        System.out.println("Press n to try again");

        char choice = scanner.next().charAt(0);

        if (choice == '1') {
            Rock rock = new Rock();
            rock.game();
        } else if (choice == '2') {
            Paper paper = new Paper();
            paper.game();
        } else if (choice == '3') {
            Scissor scissor = new Scissor();
            scissor.game();
        } else if (choice == 'x') {
            System.out.println("Are you sure you want to quit the game? Choose y/n");
            char quit = scanner.next().charAt(0);
            if (quit == 'y') {
                System.out.println("Thank you for game! bye bye!");
            } else {
                System.out.println("Choose your move");
            }
        } else if (choice == 'n') {
            System.out.println("Are you sure you want to quit the current game and start a new one?? Choose y/n");
            char startNew = scanner.next().charAt(0);
            if (startNew == 'n') {
                System.out.println("Choose your move");
            } else {
                roundsSetter.roundsSetter();
                menu();
                System.out.println("OK");
            }
        }
        System.out.println("----------------------");
    }
}


