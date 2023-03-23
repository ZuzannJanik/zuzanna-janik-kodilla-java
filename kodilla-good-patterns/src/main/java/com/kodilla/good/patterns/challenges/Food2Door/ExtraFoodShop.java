package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop extends Company {
    private String companyName = "ExtraFoodShop";
    Map<String, Integer> warehouseExtraFoodShop = new HashMap<>();

    public void delivery () {
        warehouseExtraFoodShop.put("ExtraBananas", 2000);
        warehouseExtraFoodShop.put("ExtraRum", 3000);
        warehouseExtraFoodShop.put("ExtraMilk", 1000);
    }

    public void process(String productName, Integer productQty) {
        super.process(productName, productQty);
        if (warehouseExtraFoodShop.containsKey(productName) && warehouseExtraFoodShop.get(productName) >= productQty) {
            Integer actualQty = warehouseExtraFoodShop.get(productName) - productQty;
            warehouseExtraFoodShop.put(productName, actualQty);
            System.out.println("We still have " + actualQty + " of that product! ExtraFoodShop - Order processed");
        } else {
            System.out.println("Available immediately: " + warehouseExtraFoodShop.get(productName));
        }
    }
}
