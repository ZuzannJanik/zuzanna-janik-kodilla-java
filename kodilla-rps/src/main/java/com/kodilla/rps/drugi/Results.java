package com.kodilla.rps.drugi;

public class Results {

    int myScore = 0;
    int computerScore = 0;

    public int getMyScore() {
        return myScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void results(int roundResult) {
        if (roundResult == 1) {
            myScore++;
        } else if (roundResult == 2) {
            computerScore++;
        }
    }
    public void allResults() {
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
