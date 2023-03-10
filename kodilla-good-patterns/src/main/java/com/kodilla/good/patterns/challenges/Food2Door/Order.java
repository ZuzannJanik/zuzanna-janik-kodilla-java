package com.kodilla.good.patterns.challenges.Food2Door;

public class Order {
    public static void main(String[] args) {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        HealthyShop healthyShop = new HealthyShop();

        extraFoodShop.delivery();
        glutenFreeShop.delivery();
        healthyShop.delivery();

        extraFoodShop.process("ExtraBananas", 2);
        System.out.println();
        glutenFreeShop.process("FakePizza", 1);
        System.out.println();
        healthyShop.process("TastelessCake", 200000);

    }
}
