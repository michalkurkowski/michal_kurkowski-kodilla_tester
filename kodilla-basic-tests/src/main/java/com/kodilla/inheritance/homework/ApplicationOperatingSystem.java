package com.kodilla.inheritance.homework;

public class ApplicationOperatingSystem {

    public static void main (String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1989);
        operatingSystem.turnOff();

        OperatingSystem operatingSystem1 = new OperatingSystem(1989);
        operatingSystem1.displayYear();
    }
}
