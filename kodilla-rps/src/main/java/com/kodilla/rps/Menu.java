package com.kodilla.rps;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    String choice;

    public String getChoice() {
        return choice;
    }

    public void Menu() {
        System.out.println("Press 1 to select ROCK");
        System.out.println("Press 2 to select PAPER");
        System.out.println("Press 3 to select SCISSORS");
        System.out.println("Press x to end game");
        System.out.println("Press n to try again");
        String choice = scanner.nextLine();


        switch (choice) {
            case "1":
                System.out.println("You chose ROCK!");
                break;
            case "2":
                System.out.println("You chose PAPER!");
                break;
            case "3":
                System.out.println("You chose SCISSORS");
                break;
            case "x":
                System.out.println("Are you sure you want to quit the game? Choose y/n");
                String quit = scanner.nextLine();
                if(quit == "n") {
                    Menu();
                } else {
                    break;
                }
            case "n":
                System.out.println("Are you sure you want to quit the current game and start a new one?? Choose y/n");
                String startNew = scanner.nextLine();
                if(startNew == "n") {
                    Menu();
                } else {
                    break;
                }
            default:
                System.out.println("You need to choose from menu!");
                Menu();
        }
    }
}
