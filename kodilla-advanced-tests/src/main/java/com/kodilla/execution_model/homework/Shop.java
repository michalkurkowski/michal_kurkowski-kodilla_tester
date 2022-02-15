package com.kodilla.execution_model.homework;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> getOrdersTwoYearOld(LocalDate date1, LocalDate date2) {
        List<Order> ordersDate = new ArrayList<>();
        for (Order order : orders) {
        if (date2.isAfter(order.getDate()) &&
            date1.isBefore(order.getDate()))
            ordersDate.add(order);
        }
        return ordersDate;
    }
    public List<Order> getOrderMaxMin(double max, double min) {
        List<Order> ordersValues = new ArrayList<>();
        for (Order order : orders) {
            if (max <= order.getValue() && min >= order.getValue())
                ordersValues.add(order);
        }
        return ordersValues;
    }
    public int getSize() {
        return this.orders.size();
    }
    public double getValuesOfOrders() {
        double sum = 0;
        for (Order order: orders){
            sum+= order.getValue();
        }
        return sum;
    }
}

