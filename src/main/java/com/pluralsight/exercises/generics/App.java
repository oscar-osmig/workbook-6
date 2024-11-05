package com.pluralsight.exercises.generics;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("Mac", "Air");
        Laptop laptop2 = new Laptop("Samsung", "Flex");
        List<Laptop> laptopList = new ArrayList<>(List.of(laptop1, laptop2));

        Books book1 = new Books("Narnia", "no idea");
        Books book2 = new Books("Twilight", "no idea");
        List<Books> bookList = new ArrayList<>(List.of(book1, book2));

        System.out.println("\n");
        Box<Laptop> laptopBox = new Box<>();
        laptopBox.setContent(laptopList);
        laptopBox.printBoxContent();

        Box<Books> booksBox = new Box<>();
        booksBox.setContent(bookList);
        booksBox.printBoxContent();

        System.out.println("\n########################## TESTER #############################\n");
        Tester<Laptop, Books> tester = new Tester<>(laptopList, bookList);
        tester.printT();
        tester.printU();

        System.out.println("\n########################## BONUS #############################\n");
        List<Integer> integerList = new ArrayList<>(List.of(3,2,3,4,5,5,6,4,1));
        PrintNumberArray<Integer> printNumberArray = new PrintNumberArray<>(integerList);
        printNumberArray.printNumberList();
        printNumberArray.printAverage();
    }
}
