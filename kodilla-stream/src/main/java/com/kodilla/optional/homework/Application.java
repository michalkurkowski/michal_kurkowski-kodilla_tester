package com.kodilla.optional.homework;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Walter White", null));
        students.add(new Student("Jessie Pinkman", new Teacher("Best Teacher")));
        students.add(new Student("Tuco Salamanca", new Teacher("Not A Teacher")));
        students.add(new Student("Gus Firing", null));

        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teacherName = optionalTeacher.orElse(new Teacher("undefined")).getName();

            System.out.println("Student: " + student.getName() + " Teacher: " + teacherName);
        }
    }
}