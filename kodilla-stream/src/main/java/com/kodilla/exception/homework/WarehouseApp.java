package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));

        try {
            warehouse.getOrder("2");
            System.out.println("Zamówienie jest w drodze.");
        } catch (OrderDoesntExistException e) {
            System.out.println("Zamówienie nie istnieje.");
        }

    }
}
