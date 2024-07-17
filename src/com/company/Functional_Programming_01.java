package com.company;

import java.util.List;

public class Functional_Programming_01 {

    // Traditional Approach
    public static void printAllNumberTraditional(List<Integer> numbers){
        System.out.println("Traditional Approach :");

        for (int element : numbers){
            System.out.print(element + "\t");
        }
    }

    public static void printAllEvenTraditional(List<Integer> numbers){
        System.out.println("Traditional Approach for even numbers : ");

        for (int elements : numbers){
            if (elements % 2 == 0){
                System.out.print(elements + "\t");
            }
        }
    }

    // Functional Programming Approach
    /*
    public static void print(int num){
        System.out.print(num + "\t");
    }

    public static boolean isEven(int num){
        return num % 2 == 0;
    }
     */

    public static void printAllNumberFunctionalProgramming(List<Integer> numbers){
        System.out.println("Functional Programming Approach :");

        numbers.stream().
                // forEach(Functional_Programming_01::print);
                forEach(System.out::println); // --> method reference ( print )
    }

    public static void printAllEvenFunctionalProgramming(List<Integer> numbers){
        System.out.println("Functional Programming Approach for Even numbers : ");

        numbers.stream().
                // filter(Functional_Programming_01::isEven). --> Filter - only allow even numbers
                filter(num -> num % 2 == 0). // --> lambda expression for even numbers
                forEach(System.out::println);
    }

    // Exercise 1 - print only odd numbers from the list
    public static void printAllOddFunctional(List<Integer> numbers){
        System.out.println("Functional Programming Approach for Odd numbers : ");
        numbers.stream().
                filter(num -> num % 2 != 0).
                forEach(System.out::println);
    }

    // Exercise 2 - print all courses individually
    public static void printAllCoursesFunctional(List<String> courses){
        System.out.println("Courses : ");
        courses.stream().
                forEach(System.out::println);
    }

    // Exercise 3 - print courses containing the words "Spring"
    public static void printAllCoursesFunctional01(List<String> courses){
        System.out.println("Courses containing Spring : ");
        courses.stream().
                filter(course -> course.contains("Spring")).
                forEach(System.out::println);
    }

    // Exercise 4 - print courses whose name has at least 4 letters
    public static void printAllCoursesFunctional02(List<String> courses){
        System.out.println("Courses containing at least 4 letters : ");
        courses.stream().
                filter(course -> course.length() >= 4).
                forEach(System.out::println);
    }

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12,1, 56, 78, 3, 2, 9, 12,8);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "Azure", "Docker", "Kubernetes");

        printAllNumberTraditional(numbers);
        System.out.println();
        printAllNumberFunctionalProgramming(numbers);
        System.out.println();
        printAllEvenTraditional(numbers);
        System.out.println();
        printAllEvenFunctionalProgramming(numbers);

        // Exercise 1 - print only odd numbers from the list
        System.out.println();
        printAllOddFunctional(numbers);

        // Exercise 2 - print all courses individually
        System.out.println();
        printAllCoursesFunctional(courses);

        // Exercise 3 - print all courses containing words "Spring"
        System.out.println();
        printAllCoursesFunctional01(courses);

        // Exercise 4 - print courses whose name has at least 4 letters
        System.out.println();
        printAllCoursesFunctional02(courses);
    }
}
