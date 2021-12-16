package com.kodilla.inheritance.homework;

public class ApplicationOperatingSystem {

    public static void main (String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1989);
        operatingSystem.turnOff();

        OS oS = new OS(2000);
        oS.displayYear();

        newOS newOS = new newOS(1990);
        newOS.showNothing();
    }
}
