package com.kodilla.good.patterns.challenges.Allegro;

public class CompanyDto {
    private Company company;
    private boolean companyExist;

    public CompanyDto(Company company, boolean companyExist) {
        this.company = company;
        this.companyExist = companyExist;
    }
}
