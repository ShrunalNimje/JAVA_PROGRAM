package com.company;

import java.util.Stack;

public class Advanced_Ch1_Lec10_Stack {
    public static void main(String[] args) {

        Stack<String> animals = new Stack<>();

        // push elements from top
        animals.push("Lion");
        animals.push("Rabbit");
        animals.push("Cheetah");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Animal : " + animals);

        // peek element
        System.out.println("top animal : " + animals.peek());

        // pop element from top
        System.out.println("removed animal : " + animals.pop());
        System.out.println("Animal : " + animals);
        System.out.println("top animal : " + animals.peek());
    }
}
