package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args){
        Shape square = new Square(8);
                System.out.println("Pole kwadratu wynosi" + square.surface());
                System.out.println("Obwód kwadratu wynosi" + square.circuit());

                Shape rectangle = new Rectangle(7,8);
        System.out.println("Pole prostokąta wynosi" + rectangle.surface());
        System.out.println("Obwód prostokąta wynosi" + rectangle.circuit());

        Shape triangle = new Triangle(5, 8);
        System.out.println("Pole trójkąta wynosi" + triangle.surface());
        System.out.println("Obwód trójkąta wynosi" + triangle.circuit());
    }
}
