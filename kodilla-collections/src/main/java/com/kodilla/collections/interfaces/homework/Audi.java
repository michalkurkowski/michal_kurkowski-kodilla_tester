package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {
private int speed;

public Audi(int speed) {
    this.speed = speed;
}

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 30;

    }

    @Override
    public void decreaseSpeed() {
        this.speed -= 50;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "speed=" + speed +
                '}';
    }
}