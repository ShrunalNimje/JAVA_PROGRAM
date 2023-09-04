package com.company;
import java.util.Scanner;
public class Ch14_Ps14 {
    public static void main(String[] args) {
        // Practice Set 14
        // Problem 1- Write a java program to demonstrate syntax, logical & runtime errors...

        /* Syntax error - int a = 6
                         b = 5;
        // Logical error
        // print prime numbers between 1 - 20...
        System.out.println(2);
        for (int i=1; i<=4;i++){
            System.out.println(i*2+1);
        }
        // In the above code's output 9 is not a prime number, this is called " Logical Error "...
        // Runtime error
        try {
            int a = 5;
            int b = 0;
            System.out.println(a/b);
        }
        catch (Exception e){
            System.out.println("Exception / error occurs");
            System.out.println(e);
        }
         */

        // Problem 2- Write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal argument exception.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of b :");
        // int b = sc.nextInt();
        try {
            int a = 55;
            int b = 0;
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println(" HeHe ");
            System.out.println(e);
        }
        catch (IllegalArgumentException e){
            System.out.println(" HaHa ");
            System.out.println(e);
        }

        // Problem 3- Write a program that allows you to keep accessing an array until a valid index is given. If max retries exceed 5 print "errors".
        int [] marks = {12,23,34,45,56,67,78,89};
        Scanner sc = new Scanner(System.in);
        boolean b1 = true;
        int a = 5;
        while (b1 && a>0){
            try {
                System.out.print("Enter the index number:");
                int index = sc.nextInt();
                System.out.println("The value at entered index is:"+ marks[index]);
            }
            catch (Exception e){
                System.out.println("Invalid index entered...");
                System.out.println(e);
                a--;
            }
        }
        if (a==0){
            System.out.println("You attempt all five chances \nError...");
        }

    }
}
