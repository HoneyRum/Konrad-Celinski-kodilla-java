package com.kodilla.exception.test;

public class FlightFinderMain {
    public static void main (String[] arg){
        Flight flight = new Flight("Warszawa", "Berlin");
        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(flight);
        } catch(RouteNotFoundException e){
            System.out.println("No route found");
        }
    }
}
