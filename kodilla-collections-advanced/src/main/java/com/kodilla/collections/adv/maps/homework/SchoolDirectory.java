package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<School, Principal> principalOfSchool = new HashMap<>();

        Principal adam = new Principal("Adam", "Bye");
        Principal wojtek = new Principal("Wojtek", "Hello");
        Principal robert = new Principal("Robert", "Simpson");

        School school1 = new School("podstawowa", 100, 30, 20, 10);
        School school2 = new School("średnia", 150, 50, 40);
        School school3 = new School("wyższa",200, 50, 30, 40);

        principalOfSchool.put(school1, adam);
        principalOfSchool.put(school2, wojtek);
        principalOfSchool.put(school3, robert);

        for (Map.Entry<School, Principal> schoolDirectory : principalOfSchool.entrySet())
            System.out.println(schoolDirectory.getKey().toString() + schoolDirectory.getValue().toString());
    }
}


