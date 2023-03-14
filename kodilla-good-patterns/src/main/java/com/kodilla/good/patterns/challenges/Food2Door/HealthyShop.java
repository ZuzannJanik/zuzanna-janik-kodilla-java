package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Company {
    Map<String, Integer> warehouseHealthyShop = new HashMap<>();

    public void delivery () {
        warehouseHealthyShop.put("TastelessCake", 20);
        warehouseHealthyShop.put("TastelessIce-cream", 30);
        warehouseHealthyShop.put("TastelessCandy", 40);
    }
    public boolean process(String productName, Integer productQty) {
        if (warehouseHealthyShop.containsKey(productName) && warehouseHealthyShop.get(productName) >= productQty) {
            Integer actualQty = warehouseHealthyShop.get(productName) - productQty;
            warehouseHealthyShop.put(productName, actualQty);
            System.out.println("HealthyShop! Everything here is healthy!");
            System.out.println("Your order is " + productQty + " of " + productName);
            System.out.println("We still have " + actualQty + " of that product!");
            System.out.println("HealthyShop - Order processed");
            return true;
        } else {
            System.out.println("Sorry, we don't have that many items in stock");
            System.out.println("Available immediately " + warehouseHealthyShop.get(productName));
            return false;
        }
    }
}
