package com.kodilla.good.patterns.challenges.Allegro;

import java.util.*;
import static java.util.stream.Collectors.joining;

public class Delivery {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        HealthyShop healthyShop = new HealthyShop();
        InformationService informationService = new InformationService();


        Map<Company, Product> warehouse = new HashMap<>();
    public boolean delivery() {
        warehouse.put(extraFoodShop, new Product(1,"ExtraBananas", 2000));
        warehouse.put(extraFoodShop, new Product(2,"ExtraRum", 3000));
        warehouse.put(extraFoodShop, new Product(3,"ExtraMilk", 1000));
        informationService.deliveryEmail();
        warehouse.put(glutenFreeShop, new Product(4, "FakePizza", 100));
        warehouse.put(glutenFreeShop, new Product(5, "FakeBread", 200));
        warehouse.put(glutenFreeShop, new Product(6, "FakeSpaghetti", 300));
        informationService.deliveryEmail();
        warehouse.put(healthyShop, new Product(7,"TastelessCake", 20));
        warehouse.put(healthyShop, new Product(8,"TastelessIce-cream", 30));
        warehouse.put(healthyShop, new Product(9,"TastelessCandy", 40));
        informationService.deliveryEmail();
        return true;
    }
    public Map<Company, Product> getWarehouse() {
        return warehouse;
    }
}

