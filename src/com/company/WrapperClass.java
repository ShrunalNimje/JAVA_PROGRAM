package com.company;

public class WrapperClass {
    public static void main(String[] args) {

        // primitive datatypes
        int i = 1;
        float f = 1.3f;
        char c = 'A';
        boolean b = false;

        // WrapperClasses
        Integer ii = 1;
        Float ff = 1.3f;
        Character cc = 'A';
        Boolean bb = false;

        // AutoBoxing, AutoUnboxing, Boxing and Unboxing
        Integer i1 = Integer.valueOf(1); // Boxing - but don't require as it is done automatically
        Integer i2 = 1; // AutoBoxing

        char c1 = cc.charValue(); // Unboxing - but don't require as it is done automatically
        char c2 = cc; // AutoUnboxing

        String s = "12435";
        System.out.println(Integer.valueOf(s));
    }
}
