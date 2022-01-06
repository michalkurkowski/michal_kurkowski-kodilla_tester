package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car brand: " + getBrand(car));
        System.out.println("Initial speed: 0");
        System.out.println("Current speed: " + car.getSpeed());
    }

    public static String getBrand(Car car) {
        if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Audi)
            return "Audi";
        else if (car instanceof Ford)
            return "Ford";
        else
            return "Unknown car";
    }
    }

