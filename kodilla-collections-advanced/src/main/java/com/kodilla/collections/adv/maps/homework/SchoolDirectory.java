package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<School, Principal> principalOfSchool = new HashMap<>();

        Principal adam = new Principal("Adam", "Bye");
        Principal wojtek = new Principal("Wojtek", "Hello");
        Principal robert = new Principal("Robert", "Simpson");

        School elementary = new School("podstawowa", 100);
        School middle = new School("średnia", 150);
        School high = new School("wyższa",200);

        principalOfSchool.put(elementary, adam);
        principalOfSchool.put(middle, wojtek);
        principalOfSchool.put(high, robert);

        for (Map.Entry<School, Principal> schoolDirectory : principalOfSchool.entrySet())
            System.out.println(schoolDirectory.getKey().toString() + schoolDirectory.getValue().toString());
    }
}


