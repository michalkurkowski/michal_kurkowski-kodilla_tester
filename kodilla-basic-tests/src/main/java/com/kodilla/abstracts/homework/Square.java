package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private double a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    double circuit() {
        return a*a;
    }

    @Override
    double surface() {
        return 4*a;
    }
}
