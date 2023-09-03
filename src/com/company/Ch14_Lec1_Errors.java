package com.company;

public class Ch14_Lec1_Errors {
    public static void main(String[] args) {

        // Syntax error
        // int a = 3  -- > throws an error due to semicolon
        // b = 5;  -- > throws an error due to b isn't declared

        // Logical error
        // print prime numbers between 1 to 20...
        System.out.println(2);
        for (int i=1; i<=4;i++){
            System.out.println(i*2+1);
        }
        // In the above code's output 9 is not a prime number, this is called " Logical Error "...

        // Runtime Error
        System.out.print("Enter the numbers:");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("the division of 1000 by 'a' is: "+ 1000/a);
        // runtime error is occurred by users input 
    }
}
