package com.kodilla.rps.drugi;

import java.util.Scanner;

public class RoundsSetter {
    private int roundNumber = 1;
    Scanner scanner = new Scanner(System.in);

    public void roundsSetter() {
        System.out.println("How many won rounds do we play?");
        roundNumber = scanner.nextInt();
        if (roundNumber > 0) {
            System.out.println("You want to play up to " + roundNumber + " rounds won? OKAY");
        } else {
            System.out.println("Select a number from 1 up");
            roundsSetter();
        }
    }
    public int getRoundNumber() {
        return roundNumber;
    }
}
