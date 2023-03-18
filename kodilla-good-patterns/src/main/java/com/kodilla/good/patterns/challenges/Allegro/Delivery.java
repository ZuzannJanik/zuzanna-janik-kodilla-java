package com.kodilla.good.patterns.challenges.Allegro;

import java.util.*;
import static java.util.stream.Collectors.joining;

public class Delivery {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
   //     Company glutenFreeShop = new Company("GlutenFreeShop", "glutenfreeshop@email.com", "Boston");
     //   Company healthyShop = new Company("HealthyShop", "healthyshop@email.com", "Anchorage");
        Map<Company, Product> warehouse = new HashMap<>();
    public boolean delivery() {
        warehouse.put(extraFoodShop, new Product(1,"ExtraBananas", 2000));
        warehouse.put(extraFoodShop, new Product(2,"ExtraRum", 3000));
        warehouse.put(extraFoodShop, new Product(3,"ExtraMilk", 1000));
  //      warehouse.put(glutenFreeShop, new Product(4, "FakePizza", 100));
  //      warehouse.put(glutenFreeShop, new Product(5, "FakeBread", 200));
   //     warehouse.put(glutenFreeShop, new Product(6, "FakeSpaghetti", 300));
  //      warehouse.put(healthyShop, new Product(7,"TastelessCake", 20));
   //     warehouse.put(healthyShop, new Product(8,"TastelessIce-cream", 30));
  //      warehouse.put(healthyShop, new Product(9,"TastelessCandy", 40));
        System.out.println();
        return true;
    }

    public Map<Company, Product> getWarehouse() {
        return warehouse;
    }
}

