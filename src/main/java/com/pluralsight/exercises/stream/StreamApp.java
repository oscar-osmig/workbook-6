package com.pluralsight.exercises.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.pluralsight.exercises.stream.Person.averageAge;

public class StreamApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        List<Person> matchName = new ArrayList<>();

        Person person1 = new Person("Ethan", "Sullivan", 24);
        Person person2 = new Person("Olivia", "Mercer", 23);
        Person person3 = new Person("Liam", "Callahan", 22);
        Person person4 = new Person("Ava", "Monroe", 80);
        Person person5 = new Person("Mason" ,"Gallagher", 47);
        Person person6 = new Person("Isabella", "Harrington ",67);
        Person person7 = new Person("Noah", "Preston", 37);
        Person person8 = new Person("Sophia", "Langford", 45);
        Person person9 = new Person("Noah", "Everett", 25);
        Person person10 = new Person("Mia", "Whitaker", 38);

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        people.add(person10);

        findMatch(people, matchName , scanner);

        printMatchName(matchName);


    }

    public static void findMatch(List<Person> people, List<Person> matchName, Scanner scanner){
        System.out.print("\nPlease enter a name or last name to find: ");

        String name = StreamApp.scanner.nextLine();
        for (Person p : people){
            if (p.getFirstName().equalsIgnoreCase(name) || p.getLastName().equalsIgnoreCase(name)){
                matchName.add(p);
            }
        }
    }

    public static void printMatchName(List<Person> matchName){
        System.out.println("Match People: \n");
        int counter = 1;
        for (Person p : matchName){
            System.out.println( counter + ". " + p.getFirstName() + " " + p.getLastName() + " " + p.getAge() + " yo");
            counter++;
        }
        System.out.println("Average age: " + averageAge(matchName));
    }
}
