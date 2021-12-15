package com.kodilla.inheritance.homework;

public class newOS extends OperatingSystem {

    public void showNothing() {
        System.out.println("Show me nothing.");

    }

    @Override
    public void turnOff() {
        System.out.println("Turn off operating system");
    }

    public newOS(int year) {
        super (year);
        System.out.println("There is nothing to show");
    }
}

