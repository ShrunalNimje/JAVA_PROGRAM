package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Advanced_Ch1_Lec4_HashSet_TreeSet {
    public static void main(String[] args) {

        // Set<Integer> Hs1 = new LinkedHashSet<>();
        Set<Integer> Hs1 = new TreeSet<>();
        Set<Integer> Hs2 = new HashSet<>(30,0.75f);

        // Adding an element
        Hs1.add(11);
        Hs1.add(23);
        Hs1.add(15);
        Hs1.add(18);
        Hs1.add(11);
        Hs1.add(12);
        Hs1.add(34);
        System.out.println("HashSet 1 is : " + Hs1);

        // Adding an element
        Hs2.add(221);
        Hs2.add(233);
        Hs2.add(135);
        Hs2.add(184);
        Hs2.add(221);
        Hs2.add(123);
        Hs2.add(344);
        System.out.println("HashSet 2 is : " + Hs2);

        // to add all the element of Hs1 to Hs2
        Hs2.addAll(Hs1);
        System.out.println("After adding element of Hs1 to Hs 2 : " + Hs2);

        // to remove an element
        Hs2.remove(123);
        Hs2.remove(233);
        System.out.println("After removing element of Hs2 : " + Hs2);

        // Hs2.clear(); ---> to clear all element of HashSet

        System.out.println(Hs2.isEmpty());
        System.out.println("Size of Hs1 is : " + Hs1.size());

        // to remove all the element of Hs1 from Hs2
        Hs2.removeAll(Hs1);
        System.out.println("After removing all element of Hs1 from Hs2 : " + Hs2);

    }
}
