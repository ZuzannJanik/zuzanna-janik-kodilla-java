package com.kodilla.rps.pierwszy;

import java.util.Scanner;

public class Intro {
    Scanner scanner = new Scanner(System.in);
    public void intro() {
        nameScanner();
        System.out.println("----------------------");
        rules();
    }
    public void nameScanner() {
        System.out.println("Hello what's your name?");
        String name = scanner.nextLine();
        if (name.isEmpty()) {
            System.out.println("Don't be shy - tell me your name!");
            intro();
        } else {
            System.out.println("Hey " + name + "! Nice to meet you!");
            System.out.println("Let's play rock-paper-scissors!");
        }
    }

    public void rules() {
        System.out.println("First rules:");
        System.out.println("Rock beats scissors and loses to paper.");
        System.out.println("Scissors beat paper but loses to rock.");
        System.out.println("Paper beats rock, but loses to scissors.");
        System.out.println("Simple? Let's start");
    }
}
