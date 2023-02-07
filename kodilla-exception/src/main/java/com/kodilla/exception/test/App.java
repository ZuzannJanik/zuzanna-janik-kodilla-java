package com.kodilla.exception.test;

public class App {
    public static void main(String[] args) throws RouteNotFoundException {
        Flight berlinMoscow = new Flight("Berlin", "Moscow");
        Flight parisMadrid = new Flight("Paris", "Madrid");
        Flight warsawWarsaw = new Flight("Warsaw", "Warsaw");

        FindAirport findAirport = new FindAirport();

        try {
            findAirport.findFlight(berlinMoscow); //Nie umiem zrobić żeby podstawiało tu dowolny Flight z listy. Nie wiem czy muszę stworzyć kilka przypadków czy można to zrobić automatycznie.
            System.out.println("Connection between these airports is possible.");
        } catch (RouteNotFoundException e) {
            System.out.println("Error! Airport not available!");
        } finally {
            System.out.println("Thank you for using our flight finder!");
        }
        try {
            findAirport.findFlight(parisMadrid);
            System.out.println("Connection between these airports is possible.");
        } catch (RouteNotFoundException e) {
            System.out.println("Error! Airport not available!");
        } finally {
            System.out.println("Thank you for using our flight finder!");
        }
        try {
            findAirport.findFlight(warsawWarsaw);
            System.out.println("Connection between these airports is possible.");
        } catch (RouteNotFoundException e) {
            System.out.println("Error! Airport not available!");
        } finally {
            System.out.println("Thank you for using our flight finder!");
        }
    }
}