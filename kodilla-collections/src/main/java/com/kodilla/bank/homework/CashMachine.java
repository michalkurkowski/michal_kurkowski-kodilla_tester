package com.kodilla.bank.homework;

public class CashMachine {
    private double[] transactions;
    private int size;

    public CashMachine() {
        this.transactions = new double[8];
        this.size = 0;
    }
    public void addTransactions(double transaction) {
        this.size++;
        double[] newTransactions = new double[this.size];

                System.arraycopy(transactions, 0, newTransactions, 0, transactions.length);
                newTransactions[this.size - 1] = transaction;
                this.transactions = newTransactions;
    }
    }
