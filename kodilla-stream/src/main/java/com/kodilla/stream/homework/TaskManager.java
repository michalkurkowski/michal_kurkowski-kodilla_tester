package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<String> name = TaskRepository.getTasks()
                .stream()
                .filter(u -> u.getOpened().isAfter(LocalDate.of(2021,02,15)))
                .map(TaskManager::getName)
                .collect(Collectors.toList());
        System.out.println(name);
    }
    public static String getName(Task task) {
        return task.getName();
    }
}