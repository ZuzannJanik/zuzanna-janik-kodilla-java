package com.kodilla.rps.drugi;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {
        boolean end = false;
        int counter = 0;
        Menu menu = new Menu();
        Results results = new Results();


        NameScanner nameScanner = new NameScanner();
        nameScanner.nameScanner();
        System.out.println("----------------------");

        Rules rules = new Rules();
        rules.rules();
        System.out.println("----------------------");

        RoundsSetter roundsSetter = new RoundsSetter();
        roundsSetter.roundsSetter();
        System.out.println("----------------------");

        while (!end) {
            menu.menu(results);
            counter++;

            if (results.getComputerScore() == roundsSetter.getRoundNumber() || results.getMyScore() == roundsSetter.getRoundNumber()) {
                end = true;
            }
        }
        results.allResults();
            System.out.println("----------------------");
        }

    }




