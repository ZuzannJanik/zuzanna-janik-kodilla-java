package com.kodilla.good.patterns.challenges.KodillaAirplaneCompany;

import java.util.Objects;

public class Flight {
    private Enum departureAirport;
    private Enum arrivalAirport;

    public Flight(Enum departureAirport, Enum arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public Enum getDepartureAirport() {
        return departureAirport;
    }

    public Enum getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departureAirport, flight.departureAirport) && Objects.equals(arrivalAirport, flight.arrivalAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureAirport, arrivalAirport);
    }

    @Override
    public String toString() {
        return "Flight from " + departureAirport + " to " + arrivalAirport;
    }
}
