package com.kodilla.good.patterns.challenges.Food2Door;

public abstract class Company {
   void process(String productName, Integer productQty) {
        System.out.println();
        System.out.println("Welcome to the Food2Door store!");
        System.out.println("Your order is " + productQty + " of " + productName);
    }
}
