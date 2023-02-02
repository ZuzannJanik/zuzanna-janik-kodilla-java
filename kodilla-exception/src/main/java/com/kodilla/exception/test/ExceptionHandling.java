package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {
    public void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(1.5, 1.0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Your numbers unfortunately meet one of these conditions: ");
            System.out.println("x >= 2  or x <1 or y = 1.5");
        } finally {
            System.out.println();
            System.out.println("I have no idea what this app does...");
        }
    }
}