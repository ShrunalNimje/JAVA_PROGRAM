package com.company;

// import java.util.Scanner;  --> import Scanner class from java.util
// import java.util.*;  --> import all / everything from java.util
public class Ch12_Lec1 {
    public static void main(String[] args) {
        System.out.print("This is Shrunal Nimje and age is about ");
        // Scanner sc = new Scanner(System.in);
        java.util.Scanner sc = new java.util.Scanner(System.in); // --> we can also use scanner class without importing
        sc.nextInt();

        java.util.Random r = new java.util.Random();
        System.out.println(r.nextInt(0,99));

    }
}
