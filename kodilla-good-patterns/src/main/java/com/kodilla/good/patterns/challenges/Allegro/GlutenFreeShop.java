package com.kodilla.good.patterns.challenges.Allegro;

public class GlutenFreeShop extends Company {
    private String companyName = "GlutenFreeShop";
    private String companyMail = "glutenfreeshop@email.com";
    private String companyAdress = "Boston";
    public boolean process (String productName, Integer productQty) {
        super.process(productName, productQty);
        System.out.println("Thank you for shopping in GlutenFreeShop! We do not contain gluten");
        return true;
    }
}
