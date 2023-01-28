package com.kodilla.stream.world;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;


import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity(){
        //Given
    World world = new World();

    Continent asia = new Continent("Asia");
    Continent europe = new Continent("Europe");
    Continent africa = new Continent("Africa");

    //Wiem, że niepotrzebne są prawdziwe dane - byłam ciekawa.
    Country malaysia = new Country("Malaysia", BigDecimal.valueOf(33570000));
    Country indonesia  = new Country("Indonesia", BigDecimal.valueOf(273800000));
    Country thailand = new Country("Thailand", BigDecimal.valueOf(71600000));

    Country germany = new Country("Germany", BigDecimal.valueOf(83200000));
    Country lichtenstein = new Country("Lichtenstein", BigDecimal.valueOf(39039));
    Country monaco = new Country("Monaco", BigDecimal.valueOf(36686));

    Country kenya = new Country("Kenya", BigDecimal.valueOf(53010000));
    Country nigeria = new Country("Nigeria", BigDecimal.valueOf(213400000));
    Country congo = new Country("Congo", BigDecimal.valueOf(5836000));

    world.addContinent(asia);
    world.addContinent(europe);
    world.addContinent(africa);

   asia.addCountry(malaysia);
   asia.addCountry(indonesia);
   asia.addCountry(thailand);

   europe.addCountry(germany);
   europe.addCountry(lichtenstein);
   europe.addCountry(monaco);

   africa.addCountry(kenya);
   africa.addCountry(nigeria);
   africa.addCountry(congo);

        //When
        BigDecimal peopleOfTheWorld = world.getPeopleQuantity();

        //Then
        Assertions.assertEquals(BigDecimal.valueOf(734491725), peopleOfTheWorld);

    }

}
