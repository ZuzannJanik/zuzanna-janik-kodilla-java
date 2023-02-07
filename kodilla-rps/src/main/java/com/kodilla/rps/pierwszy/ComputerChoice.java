package com.kodilla.rps.pierwszy;

import java.util.Random;

public class ComputerChoice {
    Random random = new Random();
    int computerMove = random.nextInt(2)+1;
}
