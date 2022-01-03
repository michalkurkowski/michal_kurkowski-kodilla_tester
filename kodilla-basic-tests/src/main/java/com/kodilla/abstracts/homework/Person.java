package com.kodilla.abstracts.homework;

public class Person {

    String name;
    Job job;
    int age;

    public Person(String name, Job job, int age) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    String getName() {
        return this.name;
    }

    Job getJob() {
        return this.job;
    }

    int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        Job jobLawyer = new Lawyer();
        Person michal = new Person("Michal", jobLawyer, 40);
        System.out.println(michal.getName());
        System.out.println(michal.getAge());
        michal.getJob().showRes();

        Job lawyer = new Lawyer();
        PersonProcessor processor = new PersonProcessor();
        processor.process(lawyer);

        }
    }