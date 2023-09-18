package com.company;
import java.util.*;

public class Advanced_Ch1_Lec2_LinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>();

        // Adding an element
        ll1.add(11);
        ll1.add(12);
        ll1.add(13);
        ll1.add(14);
        ll1.add(15);
        ll1.add(16);

        ll2.add(114);
        ll2.add(115);
        ll2.add(116);

        // Adding an element at specific index
        ll1.add(3,20);
        ll2.add(1,234);

        System.out.println("LinkedList 1 is : "+ll1);
        System.out.println("LinkedList 2 is : "+ll2);

        // Adding all element of ll2 to ll1
        ll1.addAll(ll2);
        System.out.println("After adding elements of LinkedList 2 is : " + ll1);

        // adding first and last element
        ll2.addFirst(234);
        ll2.addLast(345);
        System.out.println("After adding first & last elements to LinkedList 2 is : " + ll2);

        // remove an element
        ll2.remove(1);
        ll2.remove(3);
        System.out.println("After removing element of first & third index of LinkedList 2 is : " + ll2);


        // set an element --> this method remove an element of existing LinkedList...
        // set() method is used to change an already existing element of a linked list...
        ll1.set(3,35);
        System.out.println("After set an element to ll1 : "+ll1);

        // clear all the elements
        ll1.clear();
        ll2.clear();
        System.out.println("After clear all the element of ll1 : "+ll1);
        System.out.println("After clear all the element of ll2 : "+ll2);

    }
}
