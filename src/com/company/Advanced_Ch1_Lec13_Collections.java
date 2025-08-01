package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Advanced_Ch1_Lec13_Collections {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(22);
        list.add(11);
        list.add(12);
        list.add(23);
        list.add(12);
        System.out.println(list);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list, 12));
    }
}
