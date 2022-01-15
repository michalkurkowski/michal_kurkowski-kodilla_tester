package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        Book novel = BookManager.createBook("Gra w klasy", "Cortazar");
        Book poetry = BookManager.createBook("Wiersze zebrane", "Miłosz");
        Book sociology = BookManager.createBook("Chamstwo", "Pobłocki");
        Book politology = BookManager.createBook("Chamstwo", "Pobłocki");

        System.out.println(novel.getTitle() + " " + novel.getAuthor());
        System.out.println(poetry.getTitle() + " " + poetry.getAuthor());
        System.out.println(sociology.getTitle() + " " + sociology.getAuthor());
        System.out.println(politology.getTitle() + " " + politology.getAuthor());
        System.out.println(BookManager.howManyBooks());
    }
}