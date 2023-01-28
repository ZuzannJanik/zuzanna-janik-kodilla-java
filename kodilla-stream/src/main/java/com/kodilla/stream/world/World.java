package com.kodilla.stream.world;
import java.math.BigDecimal;
import java.util.*;

public class World {
    private final List<Continent> continentsOnWorldList = new ArrayList<>();
    public void addContinent(Continent continent) {
        continentsOnWorldList.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
    BigDecimal peopleOnWorld = continentsOnWorldList.stream()
        .flatMap(continent -> continent.getCountryOnContinentList().stream())
        .map(Country::getPeopleQuantity)
        .reduce(BigDecimal.ZERO,(sum, current) -> sum = sum.add(current));
    return peopleOnWorld;
    }
}


