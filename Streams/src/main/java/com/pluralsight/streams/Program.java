package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        people.add(new Person("Alice", "Johnson", 28));
        people.add(new Person("Bob", "Smith", 34));
        people.add(new Person("Charlie", "Brown", 22));
        people.add(new Person("Diana", "Taylor", 30));
        people.add(new Person("Ethan", "Williams", 41));
        people.add(new Person("Fiona", "Harris", 26));
        people.add(new Person("George", "Martin", 38));
        people.add(new Person("Hannah", "Anderson", 24));
        people.add(new Person("Ian", "Thomas", 45));
        people.add(new Person("Julia", "White", 29));


        System.out.println("-----Welcome to the 10 person search exercise-----");


        //average age
        Double averageAge = people.stream()
                .mapToInt(Person::getAge)
                .average() .getAsDouble();

        System.out.printf("\nAverage age of list: %.2f", averageAge);

        //oldest age
        int oldest = people.stream()
                .mapToInt(Person::getAge)
                .max() .getAsInt();

        System.out.println("\n\nThe oldest age is: " + oldest);


        //youngest age
        int youngest = people.stream()
                .mapToInt(Person::getAge)
                .min() .getAsInt();

        System.out.println("\nThe youngest age is: " + youngest);

        System.out.print("\nEnter First or Last name of the peron you want to search: ");
        String searchName = input.nextLine().trim();

        //Search function
        List<Person> matches = people.stream()
                .filter(p -> p.getFirstName().equalsIgnoreCase(searchName) || p.getLastName().equalsIgnoreCase(searchName))
                .toList();

        //System.out.println(matches); (same as below)
        matches.forEach(System.out::println);

    }
}
