package com.company;

import java.util.Map;
import java.util.TreeMap;

public class Advanced_Ch1_Lec12_HashMap_TreeMap {
    public static void main(String[] args) {

        // Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map = new TreeMap<>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);

        System.out.println(map);

        System.out.println(map.containsKey("Two"));
        System.out.println(map.containsValue(7));

        map.putIfAbsent("Five", 55);
        map.remove("Two");

        for(Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for (String key : map.keySet()) {
            System.out.println(key);
        }

        for (Integer value : map.values()) {
            System.out.println(value);
        }
    }
}
