package com.company;

import java.util.Arrays;

public class Advanced_Ch1_Lec13_ArraysClass {
    public static void main(String[] args) {

        int[] arr = {2, 4, 7, 23, 34, 45, 55, 56};
        int a = Arrays.binarySearch(arr, 55);
        System.out.println("the index of element 55 is " + a);

        int [] arr1 = {2, 4, 1, 5, 2, 45, 34, 23, 12, 22};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        Arrays.fill(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}
