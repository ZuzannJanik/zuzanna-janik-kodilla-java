package com.kodilla.good.patterns.challenges.Allegro;

public class InformationService extends Information {

    public void deliveryEmail (Company company) {
        super.deliveryEmail(company);
        System.out.println("***Sending email on adress: " + company.getCompanyMail() + " ***");
    }

    @Override
    public void checkWarehouseEmail(Product product) {
        super.checkWarehouseEmail(product);

    }
}
