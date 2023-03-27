package com.kodilla.good.patterns.challenges.Allegro;

public abstract class Company {
    Delivery delivery = new Delivery();
    private String companyName;
    private String companyMail;
    private String companyAdress;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyMail() {
        return companyMail;
    }

    public void setCompanyMail(String companyMail) {
        this.companyMail = companyMail;
    }

    public String getCompanyAdress() {
        return companyAdress;
    }

    public void setCompanyAdress(String companyAdress) {
        this.companyAdress = companyAdress;
    }

    public boolean process (String productName, Integer productQty) {
            System.out.println("Welcome to the Food2Door store!");
            System.out.println("Your order is " + productQty + " of " +  " from " + getCompanyName());
        return true;
    }
}
