package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    String schoolName;
    List<Integer> studentsNumber = new ArrayList<>();

    public School(String schoolName, int... studentsNumber) {
        this.schoolName = schoolName;
        for (int studentNumber : studentsNumber)
            this.studentsNumber.add(studentNumber);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public List<Integer> getStudentsNumber() {
        return studentsNumber;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", students=" + studentsNumber +
                '}';
    }
}