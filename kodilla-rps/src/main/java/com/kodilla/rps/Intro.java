package com.kodilla.rps;

import java.util.Scanner;

public class Intro {
    Scanner scanner = new Scanner(System.in);
    public void Intro() {
        nameScanner();
        roundsSetter();
        rules();
    }
    public void nameScanner() {
        System.out.println("Hello what's your name?");
        String name = scanner.nextLine();
        if (name.isEmpty()) {
            System.out.println("Don't be shy - tell me your name!");
            Intro();
        } else {
            System.out.println("Hey " + name + "! Nice to meet you!");
            System.out.println("Let's play rock-paper-scissors!");
        }
    }
    public void roundsSetter() {
        System.out.println("How many won rounds do we play?");
        int rounds = scanner.nextInt();
        if (rounds > 0) {
            System.out.println("You want to play up to " + rounds + " rounds won? OKAY");
        } else {
            System.out.println("Select a number from 1 up");
            roundsSetter();
        }
    }
    public void rules() {
        System.out.println("First rules:");
        System.out.println("Rock beats scissors and loses to paper.");
        System.out.println("Scissors beat paper but loses to rock.");
        System.out.println("Paper beats rock, but loses to scissors.");
        System.out.println("Simple? Let's start");
        System.out.println("Press ENTER");

    }
}
