package com.kodilla.collections.lists.homework;


import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Audi;


import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.arrays.homework.CarUtils.getBrand;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Audi Audi = new Audi(100);
        cars.add(Audi);
        cars.add(new Opel(50));
        cars.add(new Ford(100));

        cars.remove(1);
        cars.remove(Audi);                             // [3]

        System.out.println(cars.size());
        for (Car car : cars) {

            System.out.println("-----------------------------");
            System.out.println("Car brand: " + getBrand(car));
            System.out.println("Initial speed: 0");
            System.out.println("Current speed: " + car.getSpeed());
        }
    }
}

