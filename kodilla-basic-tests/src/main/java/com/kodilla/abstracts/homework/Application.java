package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args){
        Shape kwadrat = new Kwadrat();
        ((Kwadrat) kwadrat).a = 6;
                System.out.println("Pole kwadratu wynosi" + kwadrat.Pole());
                System.out.println("Obwód kwadratu wynosi" + kwadrat.Obwód());

                Shape prostokąt = new Prostokąt();
                ((Prostokąt) prostokąt).a = 4;
                ((Prostokąt) prostokąt).b = 8;
        System.out.println("Pole prostokąta wynosi" + prostokąt.Pole());
        System.out.println("Obwód prostokąta wynosi" + prostokąt.Obwód());

        Shape trójkąt = new Trójkąt();
        ((Trójkąt) trójkąt).a = 4;
        ((Trójkąt) trójkąt).h = 3;
        System.out.println("Pole trójkąta wynosi" + trójkąt.Pole());
        System.out.println("Obwód trójkąta wynosi" + trójkąt.Obwód());
    }
}
