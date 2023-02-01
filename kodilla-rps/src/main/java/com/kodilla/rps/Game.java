package com.kodilla.rps;

import java.util.Random;

public class Game {
    int myScore = 0;
    int computerScore = 0;

    public int getMyScore() {
        return myScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    Menu menu = new Menu();
    ComputerChoice computerChoice = new ComputerChoice();

public void Game() {
            if (menu.choice == "1" && computerChoice.computerMove == 1) {
                System.out.println("Draw. No points");
            } else if (menu.choice == "1" && computerChoice.computerMove == 2) {
                System.out.println("Paper beats rock. Point for computer!");
                computerScore += 1;
            } else if (menu.choice == "1" && computerChoice.computerMove == 3) {
                System.out.println("Rock beats scissors. Point for YOU!");
                myScore += 1;
            }

        }
}
