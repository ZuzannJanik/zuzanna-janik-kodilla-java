package com.kodilla.good.patterns.challenges.Allegro;

public class ExtraFoodShop extends Company {

        private String companyName = "ExtraFoodShop";
        private String companyMail = "extrafoodshop@email.com";
        private String companyAdress = "NewYork";

        public boolean process (String productName, Integer productQty) {
                super.process(productName, productQty);
                System.out.println("Thank you for shopping in ExtraFoodShop! With us everything is extra");
                return true;
        }
}

