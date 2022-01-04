package com.kodilla.collections.interfaces.homework;


public class CarRace {
    public static void main(String[] args) {
        Audi audi = new Audi(70);
        doRace(audi);

        Opel opel = new Opel(70);
        doRace(opel);

        Ford ford = new Ford(70);
        doRace(ford);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("Samochód porusza się z prędkością" + car.getSpeed() + "kilometrów na godzinę.");
    }
}
