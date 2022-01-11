package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    public School(String name, int student) {
    }

    public static void main(String[] args) {
        List<School> schoolClassList = new ArrayList<>();
        School classNr1 = new School("Podstawowa", 31);
        School classNr2 = new School("Średnia", 28);
        School classNr3 = new School("Wyższa", 24);
        schoolClassList.add(classNr1);
        schoolClassList.add(classNr2);
        schoolClassList.add(classNr3);
    }
}