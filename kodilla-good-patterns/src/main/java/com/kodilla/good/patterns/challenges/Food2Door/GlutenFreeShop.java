package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop extends Company {
    Map<String, Integer> warehouseGlutenFreeShop = new HashMap<>();

    public void delivery () {
        warehouseGlutenFreeShop.put("FakeBread", 200);
        warehouseGlutenFreeShop.put("FakePizza", 100);
        warehouseGlutenFreeShop.put("FakeSpaghetti", 300);
    }
    public void process(String productName, Integer productQty) {
        super.process(productName, productQty);
        if (warehouseGlutenFreeShop.containsKey(productName) && warehouseGlutenFreeShop.get(productName) >= productQty) {
            Integer actualQty = warehouseGlutenFreeShop.get(productName) - productQty;
            warehouseGlutenFreeShop.put(productName, actualQty);
            System.out.println("We still have " + actualQty + " of that product! GlutenFreeShop - Order processed");
        } else {
            System.out.println("Available immediately: " + warehouseGlutenFreeShop.get(productName));
        }
    }
}
