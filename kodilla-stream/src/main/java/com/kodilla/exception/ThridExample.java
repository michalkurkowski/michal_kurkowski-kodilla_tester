package com.kodilla.exception;

public class ThridExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        try {
            boolean isViennaInUse = airportRepository.isAirportInUse("Vienna");
            System.out.println("Vienna status:" + isViennaInUse);
        } catch (AirportNotFoundException e) {
            System.out.println("Sorry");
        } finally {
            System.out.println("Thank your for using Kodilla Airline");
        }
    }
}
