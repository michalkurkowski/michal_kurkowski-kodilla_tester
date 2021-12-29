package com.kodilla.abstracts.homework;

public class Person {

    String name;
    String job;
    int age;

    public Person(String name, String job, int age) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    String getName() {
        return this.name;
    }

    String getJob() {
        return this.job;
    }

    int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        Person michal = new Person("Michal", "prawnik", 40);
        System.out.println(michal.getName());
        System.out.println(michal.getAge());
        System.out.println(michal.getJob());

        Job lawyer = new Lawyer();
        PersonProcessor processor = new PersonProcessor();
        processor.process(lawyer);

        }
    }