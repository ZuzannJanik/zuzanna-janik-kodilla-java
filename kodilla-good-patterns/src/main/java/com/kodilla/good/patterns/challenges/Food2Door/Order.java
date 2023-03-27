package com.kodilla.good.patterns.challenges.Food2Door;

public class Order {
    public static void main(String[] args) {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        HealthyShop healthyShop = new HealthyShop();

        System.out.println("Welcome to the Food2Door store!");

        extraFoodShop.delivery();
        extraFoodShop.process("ExtraBananas", 2);

        glutenFreeShop.delivery();
        glutenFreeShop.process("FakePizza", 1);

        healthyShop.delivery();
        healthyShop.process("TastelessCake", 200000);
    }
}
