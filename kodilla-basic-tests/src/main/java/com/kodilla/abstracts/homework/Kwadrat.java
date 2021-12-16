package com.kodilla.abstracts.homework;

public class Kwadrat extends Shape {
    public double a;

    @Override
    double Obwód() {
        return a*a;
    }

    @Override
    double Pole() {
        return 4*a;
    }
}
