package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int randomCar = random.nextInt(3);
        int randomIncreaseSpeed = random.nextInt(100);

        if (randomCar == 0) {
            return new Audi(0 + randomIncreaseSpeed);
        } else if (randomCar == 1)
            return new Ford(0 + randomIncreaseSpeed);
        else
            return new Opel(0 + randomIncreaseSpeed);
    }

}