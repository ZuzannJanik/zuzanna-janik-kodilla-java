package com.kodilla.good.patterns.challenges.KodillaAirplaneCompany;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class KodillaFlights {
    public static void main(String[] args) {
        FlightsFinder flightsFinder = new FlightsFinder();
        flightsFinder.makeConnections();
        String airports = Arrays.toString(Airports.values());

        Flight flight = new Flight(Airports.GDANSK, Airports.WROCLAW);
        List<Flight> flightsFrom = flightsFinder.departureList(flight.getDepartureAirport());
        List<Flight> flightsTo = flightsFinder.arrivalList(flight.getArrivalAirport());
        Map<Flight, Flight> connectingFlight = flightsFinder.getConnectingFlightList(flight.getDepartureAirport(), flight.getArrivalAirport());

        System.out.println("Welcome in KodillaFlights");
        System.out.println("We service airports: " + airports);

        System.out.println();
        System.out.println("Flights from " + flight.getDepartureAirport());
        for (Flight flight1 : flightsFrom) {
            System.out.println(flight1);
        }

        System.out.println();
        System.out.println("Flights to " + flight.getArrivalAirport());
        for (Flight flight2 : flightsTo) {
            System.out.println(flight2);
        }

        System.out.println();
        System.out.println("You can fly from this airport with a change");
        Set<Map.Entry<Flight, Flight>> entries = connectingFlight.entrySet();
        for (Map.Entry<Flight, Flight> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }



    }
}

