package com.kodilla.exception.test;

import java.util.*;

public class FindAirport {

  public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> availableAirportsMap = new HashMap<>();
        availableAirportsMap.put("Paris", true);
        availableAirportsMap.put("Moscow", false);
        availableAirportsMap.put("Warsaw", true);
        availableAirportsMap.put("Madrid", true);
        availableAirportsMap.put("Minsk", false);

    if(availableAirportsMap.containsKey(flight.getArrivalAirport()) && availableAirportsMap.get(flight.getArrivalAirport())){
        return true;
    }else {
        throw  new RouteNotFoundException();
    }
    }
}



