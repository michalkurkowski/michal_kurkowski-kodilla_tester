package com.kodilla.collections.adv.exercises.homework;

import java.util.HashSet;
import java.util.Set;

public class FlightRepository {

    static Set<Flight> getFlightsTable() {
        Set <Flight> flights = new HashSet<>();
        flights.add (new Flight ("Madrid", "Warsaw"));
        flights.add (new Flight ("Milano", "Warsaw"));
        flights.add (new Flight ("Barcelona", "Warsaw"));

        return flights;
    }
}
