package com.kodilla.abstracts.homework;

public class Lawyer extends Job {

    public Lawyer() {
        super(10000);
    }

    @Override
    public void showRes() {
           System.out.println("He has to cheat people.");

    }
}
