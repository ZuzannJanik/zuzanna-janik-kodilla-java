package com.kodilla.rps.drugi;

import java.util.Random;

public class ComputerChoice {
    Random random = new Random();
    int computerMove = random.nextInt(2)+1;
}
