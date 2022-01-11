package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
        public static void main(String[] args) {
            Set<Stamp> stamps = new HashSet<>();
            stamps.add(new Stamp("First Stamp", "Yes", 3.0, 2.0));
            stamps.add(new Stamp("Second Stamp",  "Yes", 6.0, 3.5));
            stamps.add(new Stamp("Third Stamp",  "No",2.0, 4.5));

            System.out.println(stamps.size());
            for (Stamp stamp : stamps)
                System.out.println(stamp);
        }
}
