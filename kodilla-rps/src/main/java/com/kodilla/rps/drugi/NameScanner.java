package com.kodilla.rps.drugi;

import java.util.Scanner;

public class NameScanner {
    Scanner scanner = new Scanner(System.in);

    public void nameScanner() {
        System.out.println("Hello what's your name?");
        String name = scanner.nextLine();
        if (name.isEmpty()) {
            System.out.println("Don't be shy - tell me your name!");
        } else {
            System.out.println("Hey " + name + "! Nice to meet you!");
            System.out.println("Let's play rock-paper-scissors!");
        }
    }
}
