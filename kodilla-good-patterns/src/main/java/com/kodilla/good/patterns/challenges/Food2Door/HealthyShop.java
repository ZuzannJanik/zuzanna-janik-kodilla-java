package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop extends Company {
    Map<String, Integer> warehouseHealthyShop = new HashMap<>();

    public void delivery () {
        warehouseHealthyShop.put("TastelessCake", 20);
        warehouseHealthyShop.put("TastelessIce-cream", 30);
        warehouseHealthyShop.put("TastelessCandy", 40);
    }
    public void process(String productName, Integer productQty) {
        super.process(productName, productQty);
        if (warehouseHealthyShop.containsKey(productName) && warehouseHealthyShop.get(productName) >= productQty) {
            Integer actualQty = warehouseHealthyShop.get(productName) - productQty;
            warehouseHealthyShop.put(productName, actualQty);
            System.out.println("We still have " + actualQty + " of that product! HealthyShop - Order processed");
        } else {
            System.out.println("Available immediately: " + warehouseHealthyShop.get(productName));
        }
    }
}
