package com.company;
import java.util.*;

public class Advanced_Ch1_Lec1_ArrayList {
    public static void main(String[] args) {

        List<Integer> AI = new ArrayList<>();

        // We can simply take capacity of ArrayList
        List<Integer> AI2 = new ArrayList<>(2);

        // Adding an element
        AI.add(3);
        AI.add(4);
        AI.add(5);
        AI.add(8);
        AI2.add(12);
        AI2.add(14);
        AI2.add(30);

        // Adding an element at specific index
        AI.add(3,3);

        System.out.println("ArrayList 1 is : " + AI);
        System.out.println("ArrayList 2 is : " + AI2);

        // Adding all element of AI2 to AI
        AI.addAll(2,AI2);
        System.out.println("After adding elements of ArrayList 2 is : " + AI);

        // First method to print ArrayList...
        for (int i = 0; i < AI.size(); i++) {
            System.out.println("Using For loop : " + AI.get(i));
        }

        // Second method to print ArrayList...
        for (Integer e: AI){
            System.out.println(e);
        }

        // third method to print ArrayList...
        Iterator<Integer> it1 = AI.iterator();

        while(it1.hasNext()) {
            System.out.println(it1.next());
        }

        // Removing an element
        AI.remove(4);
        System.out.println("After removing an element from index 4 is : " + AI);

        AI.remove(Integer.valueOf(12));
        System.out.println("After removing 12 value : " + AI);

        // AI.clear(); ---> clear all the elements of an ArrayList...

        // set() method is to change an already existing element of ArrayList
        AI2.set(2,234);
        System.out.println("After set an element 234 at index 2 is of ArrayList 2 : " + AI2);

        // return true if elements contains
        System.out.println("AI2 contains 45 : "+ AI2.contains(45));
        System.out.println("AI2 contains 30 : "+ AI2.contains(30));

        // tell us starting & last index of elements
        System.out.println(AI.indexOf(3));
        System.out.println(AI.lastIndexOf(3));

    }
}
