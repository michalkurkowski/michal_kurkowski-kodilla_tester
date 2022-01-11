package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
    }

    public double getWholeBalance() {
        double result = 0.0;
        for (CashMachine cashMachine : cashMachines) ;

        return result;
    }
}
