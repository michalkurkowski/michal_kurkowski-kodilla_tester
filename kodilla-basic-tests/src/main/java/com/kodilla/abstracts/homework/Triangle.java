package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    private double a, h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    double circuit() {
        return 3*a;
    }

    @Override
    double surface() {
        return a*h/2;
    }
}

