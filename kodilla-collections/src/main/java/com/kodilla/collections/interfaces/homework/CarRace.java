package com.kodilla.collections.interfaces.homework;


public class CarRace {
    public static void main(String[] args) {
        Audi audi = new Audi(100);
        doRace(audi);

        Opel opel = new Opel(50);
        doRace(opel);

        Ford ford = new Ford(80);
        doRace(ford);
    }

    private static void doRace(Car car) {
        System.out.println();
    }
}
