package com.kodilla.good.patterns.challenges.KodillaAirplaneCompany;

import java.util.*;
import java.util.stream.Collectors;

public class FlightsFinder {
    List<Flight> connections = new ArrayList<>();

    public List<Flight> makeConnections() {
        connections.add(new Flight(Airports.GDANSK, Airports.POZNAN));
        connections.add(new Flight(Airports.KRAKOW, Airports.POZNAN));
        connections.add(new Flight(Airports.POZNAN, Airports.WROCLAW));
        connections.add(new Flight(Airports.WROCLAW, Airports.BYDGOSZCZ));
        connections.add(new Flight(Airports.WROCLAW, Airports.GDANSK));
        connections.add(new Flight(Airports.GDANSK, Airports.KRAKOW));
        connections.add(new Flight(Airports.KRAKOW, Airports.WROCLAW));
        return connections;
    }

    public List<Flight> departureList(Enum departureAirport) {
        return connections.stream()
                .filter(x -> x.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> arrivalList(Enum arrivalAirport) {
        return connections.stream()
                .filter(x -> x.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
    }

    public Map<Flight, Flight> getConnectingFlightList(Enum departureAirport, Enum arrivalAirport) {
        Map<Flight, Flight> connectingFlightList = new HashMap<>();

        List<Flight> from = connections.stream()
                    .filter(x -> x.getDepartureAirport().equals(departureAirport))
                    .collect(Collectors.toList());

        List<Flight> to = connections.stream()
                    .filter(x -> x.getArrivalAirport().equals(arrivalAirport))
                    .collect(Collectors.toList());

        for (Flight flightDeparture : from) {
            for (Flight flightArrival : to) {
                if (flightDeparture.getArrivalAirport().equals(flightArrival.getDepartureAirport())) {
                    connectingFlightList.put(flightDeparture, flightArrival);
                }
            }
        }
        return connectingFlightList;
    }
}
