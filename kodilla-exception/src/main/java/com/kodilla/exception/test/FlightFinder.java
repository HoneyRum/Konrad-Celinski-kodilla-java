package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {
    public void findFlight(Flight flight){
        HashMap<String, Boolean> airports = new HashMap<>();
        airports.put(flight.getArrivalAirport(), true);
        airports.put(flight.getDepartureAirport(), true);
    }
}
