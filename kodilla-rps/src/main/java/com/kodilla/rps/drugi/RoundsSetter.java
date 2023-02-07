package com.kodilla.rps.drugi;

import java.util.Scanner;

public class RoundsSetter {
    Scanner scanner = new Scanner(System.in);

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
}
