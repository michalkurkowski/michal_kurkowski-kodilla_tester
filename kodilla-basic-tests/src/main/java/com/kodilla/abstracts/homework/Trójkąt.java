package com.kodilla.abstracts.homework;

public class Trójkąt extends Shape {
    public double a, h;

    @Override
    double Obwód() {
        return 3*a;
    }

    @Override
    double Pole() {
        return a * h / 2;
    }
}

