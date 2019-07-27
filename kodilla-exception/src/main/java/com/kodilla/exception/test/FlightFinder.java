package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {

    HashMap<String, Boolean> airports = new HashMap<>();

    public FlightFinder() {
        this.airports.put("Warszawa", true);
        this.airports.put("Łódź", true);
        this.airports.put("Wrocław", true);
        this.airports.put("Gdańsk", true);
        this.airports.put("Kraków", true);
        this.airports.put("Wałbrzych", true);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        if (!airports.containsKey(flight.getDepartureAirport()) || !airports.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Route not found");
        }
        if (airports.get(flight.getArrivalAirport()) && airports.get(flight.getDepartureAirport())) {
            System.out.println("Route found, departure airport: " + flight.getDepartureAirport() + ", arrival airport: " + flight.getArrivalAirport());
        } else {
            System.out.println("One of the airports is unavailable at the moment");
        }
    }
}
