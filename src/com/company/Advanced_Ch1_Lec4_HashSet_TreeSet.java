package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Advanced_Ch1_Lec4_HashSet_TreeSet {
    public static void main(String[] args) {

        // Set<Integer> Ts1 = new LinkedHashSet<>();
        Set<Integer> Ts1 = new TreeSet<>();
        Set<Integer> Hs1 = new HashSet<>(30,0.75f);

        // Adding an element
        Ts1.add(11);
        Ts1.add(23);
        Ts1.add(15);
        Ts1.add(18);
        Ts1.add(11);
        Ts1.add(12);
        Ts1.add(34);
        System.out.println("TreeSet 1 is : " + Ts1);

        // Adding an element
        Hs1.add(221);
        Hs1.add(233);
        Hs1.add(135);
        Hs1.add(184);
        Hs1.add(221);
        Hs1.add(123);
        Hs1.add(344);
        System.out.println("HashSet 1 is : " + Hs1);

        // to add all the element of Ts1 to Hs1
        Hs1.addAll(Ts1);
        System.out.println("After adding element of Ts1 to Hs1 : " + Hs1);

        // to remove an element
        Hs1.remove(123);
        Hs1.remove(233);
        System.out.println("After removing element of Hs1 : " + Hs1);

        // Hs1.clear(); ---> to clear all element of HashSet

        System.out.println(Hs1.isEmpty());
        System.out.println("Size of Ts1 is : " + Ts1.size());

        // to remove all the element of Ts1 from Hs1
        Hs1.removeAll(Ts1);
        System.out.println("After removing all element of Ts1 from Hs1 : " + Hs1);

    }
}
