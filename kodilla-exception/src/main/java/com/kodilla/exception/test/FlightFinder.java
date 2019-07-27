package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {

    HashMap<String, Boolean> airports = new HashMap<>();

    public FlightFinder() {
        this.airports.put("Warszawa", true);
    }

    public void findFlight(Flight flight){
        airports.put(flight.getArrivalAirport(), true);
        airports.put(flight.getDepartureAirport(), true);
    }
}
