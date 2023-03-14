package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Company {
    Map<String, Integer> warehouseGlutenFreeShop = new HashMap<>();

    public void delivery () {
        warehouseGlutenFreeShop.put("FakeBread", 200);
        warehouseGlutenFreeShop.put("FakePizza", 100);
        warehouseGlutenFreeShop.put("FakeSpaghetti", 300);
    }
    public boolean process(String productName, Integer productQty) {
        if (warehouseGlutenFreeShop.containsKey(productName) && warehouseGlutenFreeShop.get(productName) >= productQty) {
            Integer actualQty = warehouseGlutenFreeShop.get(productName) - productQty;
            warehouseGlutenFreeShop.put(productName, actualQty);
            System.out.println("GlutenFreeShop! Everything here is gluten free!");
            System.out.println("Your order is " + productQty + " of " + productName);
            System.out.println("We still have " + actualQty + " of that product!");
            System.out.println("GlutenFreeShop - Order processed");
            return true;
        } else {
            System.out.println("Sorry, we don't have that many items in stock");
            System.out.println("Available immediately " + warehouseGlutenFreeShop.get(productName));
            return false;
        }
    }
}
