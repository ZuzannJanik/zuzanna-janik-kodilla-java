package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Company {
    Map<String, Integer> warehouseExtraFoodShop = new HashMap<>();

    public void delivery () {
        warehouseExtraFoodShop.put("ExtraBananas", 2000);
        warehouseExtraFoodShop.put("ExtraRum", 3000);
        warehouseExtraFoodShop.put("ExtraMilk", 1000);
    }

    public boolean process(String productName, Integer productQty) {
        if (warehouseExtraFoodShop.containsKey(productName) && warehouseExtraFoodShop.get(productName) >= productQty) {
            Integer actualQty = warehouseExtraFoodShop.get(productName) - productQty;
            warehouseExtraFoodShop.put(productName, actualQty);
            System.out.println("ExtraFoodShop! Everything here is extra!");
            System.out.println("Your order is " + productQty + " of " + productName);
            System.out.println("We still have " + actualQty + " of that product!");
            System.out.println("ExtraFoodShop - Order processed");
            return true;
        } else {
            System.out.println("Sorry, we don't have that many items in stock");
            System.out.println("Available immediately " + warehouseExtraFoodShop.get(productName));
            return false;
        }
    }
}
