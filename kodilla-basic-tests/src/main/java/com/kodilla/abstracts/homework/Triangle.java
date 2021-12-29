package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    private double a, b;

    public Triangle() {
        super(4, 6);
    }

    @Override
    double circuit() {
        return 3*a;
    }

    @Override
    double surface() {
        return 4*6/2;
    }
}

