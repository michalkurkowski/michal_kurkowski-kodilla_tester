package com.kodilla.abstracts.homework;

public abstract class Job {
private int salary;

public Job(int salary) {
    this.salary = salary;
}
public int showSalary(){
    return salary;
}
    public abstract void showRes();
}