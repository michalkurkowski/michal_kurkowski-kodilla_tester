package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    private double a, b;

    public Rectangle() {
        super(2, 4);
    }

    @Override
    double circuit() {
        return a*b;
    }

    @Override
    double surface() {
        return 2*a+2*b;
    }
}
