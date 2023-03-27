package com.kodilla.good.patterns.challenges.Allegro;

public class HealthyShop extends Company {
    private String companyName = "HealthyShop";
    private String companyMail = "healthyshop@email.com";
    private String companyAdress = "Anchorage";

    public boolean process (String productName, Integer productQty) {
        super.process(productName, productQty);
        System.out.println("Thank you for shopping in HealthyShop! A healthy spirit in a healthy shop");
        return true;
    }
}
