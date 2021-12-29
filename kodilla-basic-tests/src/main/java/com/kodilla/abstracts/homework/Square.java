package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private double a, b;

    public Square() {
        super(4, 4);
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
