package com.kodilla.stream.world;


import java.util.*;


public class Continent {
    private final String continentName;
    private final List<Country> countryOnContinentList = new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }


    public List<Country> getCountryOnContinentList(){
        return new ArrayList<>(countryOnContinentList);
    }
    public void addCountry(Country country) {
        countryOnContinentList.add(country);
    }
}



