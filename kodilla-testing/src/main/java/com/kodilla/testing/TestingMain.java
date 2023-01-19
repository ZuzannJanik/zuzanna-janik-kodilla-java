package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

    SimpleUser simpleUser = new SimpleUser ("theForumUser");
    String result = simpleUser.getUsername();
    if (result.equals("theForumUser")) {
        System.out.println("test OK");
    } else {
        System.out.println("Error!");
        }

    Calculator calculator = new Calculator();
    int resultadd = calculator.add(3,2);
    if (resultadd == (3 + 2)) {
        System.out.println("test OK");
    } else {
        System.out.println("Error!");
        }

    int resultsubstract = calculator.substract(3,2);
    if (resultsubstract == (3 - 2)) {
        System.out.println("test OK");
    } else {
        System.out.println("Error!");
        }
    }
}
