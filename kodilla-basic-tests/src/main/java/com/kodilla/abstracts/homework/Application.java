package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args){
        Shape square = new Square();
                System.out.println("Pole kwadratu wynosi" + square.surface());
                System.out.println("Obwód kwadratu wynosi" + square.circuit());

                Shape rectangle = new Rectangle();
        System.out.println("Pole prostokąta wynosi" + rectangle.surface());
        System.out.println("Obwód prostokąta wynosi" + rectangle.circuit());

        Shape triangle = new Triangle();
        System.out.println("Pole trójkąta wynosi" + triangle.surface());
        System.out.println("Obwód trójkąta wynosi" + triangle.circuit());
    }
}
