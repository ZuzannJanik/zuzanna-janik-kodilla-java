package com.kodilla.rps.drugi;

public class Results {

    int myScore = 0;
    int computerScore = 0;

    //Nie wiem jak pobrać tu wynik np. z paper
    public void results() {
        System.out.println("Your score is " + myScore + " points");
        System.out.println("Computer score is " + computerScore + " points");

        if (myScore > computerScore) {
            System.out.println("You WON!");
        } else if (myScore < computerScore){
            System.out.println("You LOST");
        } else {
            System.out.println("Draw. Nobody won");
        }
    }
}
