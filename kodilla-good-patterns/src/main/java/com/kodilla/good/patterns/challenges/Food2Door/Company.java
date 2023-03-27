package com.kodilla.good.patterns.challenges.Food2Door;

import static com.kodilla.good.patterns.challenges.Food2Door.InformationCenter.*;

public abstract class Company {
   void process(String productName, Integer productQty) {
        newOrderEmail();
        System.out.println();
        System.out.println("Your order is " + productQty + " of " + productName);
   }

   void delivery(){
       deliveryEmail();
   }
}
