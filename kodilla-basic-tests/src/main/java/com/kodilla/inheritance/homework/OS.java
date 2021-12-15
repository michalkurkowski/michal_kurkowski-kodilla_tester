package com.kodilla.inheritance.homework;

public class OS extends OperatingSystem {

    public void showAnything() {
        System.out.println("I am showing anything.");
    }
    @Override
    public void turnOn() {
        System.out.println("Turn on operating system");
    }

    public OS(int year) {
        super (year);
        System.out.println("Anything");
    }
}
