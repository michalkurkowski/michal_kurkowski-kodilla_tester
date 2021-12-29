package com.kodilla.abstracts.homework;

public abstract class Shape {

    private int a;
    private int b;

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }
    abstract double circuit();
    abstract double surface();
}
