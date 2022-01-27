package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avg = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)                          // [2]
                .average()                                 // [3]
                .getAsDouble();                            // [4]
        System.out.println(avg);                      // [5]

        double ave = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)                          // [2]
                .average()                                 // [3]
                .getAsDouble();                            // [4]
        System.out.println(ave);                      // [5]
    }
}

