package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("Turn on operating system");
    }

    public void turnOff() {
        System.out.println("Turn off operating system");
    }

    public int getYear() {
        return year;
    }

    public void displayYear() {
        System.out.println("Year of OperatingSystem: " + year);
    }
}
