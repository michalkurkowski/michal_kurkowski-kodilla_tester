package com.kodilla.abstracts.homework;

public class Prostokąt extends Shape {
    public double a, b;

    @Override
    double Obwód() {
        return a*b;
    }

    @Override
    double Pole() {
        return 2*a + 2*b;
    }
}
