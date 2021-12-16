package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.Animal;
import com.kodilla.abstracts.AnimalProcessor;
import com.kodilla.abstracts.Dog;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        Person michal = new Person("Michal", 40);
        System.out.println(michal.getName());
        System.out.println(michal.getAge());

        Job prawnik = new Prawnik();
        PersonProcessor processor = new PersonProcessor();
        processor.process(prawnik);

        }
    }