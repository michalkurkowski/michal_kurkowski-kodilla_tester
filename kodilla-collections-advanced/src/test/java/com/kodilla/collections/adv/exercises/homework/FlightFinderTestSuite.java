package com.kodilla.collections.adv.exercises.homework;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> result = flightFinder.findFlightsFrom("Barcelona");
        //then
        assertEquals(1, result.size());

    }

    @Test
    public void testFindFlightsTo() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> result = flightFinder.findFlightsTo("Warsaw");
        //then
        assertEquals(3, result.size());
    }
}