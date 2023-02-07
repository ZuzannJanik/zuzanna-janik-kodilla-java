package com.kodilla.rps.drugi;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {
        boolean end = false;
        int counter = 0;


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
            Menu menu = new Menu();
            menu.menu();
            counter++;

            if (counter == 3) { //Nie wiem jak odnieść się do wartości rounds z RoundsSetter
                end = true;
            }
        }
//Wyniki się nie znliczają
            Results results = new Results();
            results.results();
            System.out.println("----------------------");
        }
    }




