package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add (new Task ("write a list", LocalDate.of(2021, 01, 16), LocalDate.of(2021, 01, 18)));
        tasks.add(new Task("Drugie", LocalDate.of(2021, 02, 16), LocalDate.of(2021, 02, 18)));
        tasks.add(new Task("Trzecie", LocalDate.of(2021, 03, 16), LocalDate.of(2021, 03, 18)));
        tasks.add(new Task("Czwarte", LocalDate.of(2021, 04, 16), LocalDate.of(2021, 04, 18)));
        tasks.add(new Task("Piąte", LocalDate.of(2021, 05, 16), LocalDate.of(2021, 05, 18)));

        return tasks;
        }
    }

