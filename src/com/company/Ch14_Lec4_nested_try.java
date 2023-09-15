package com.company;
import java.util.Scanner;

public class Ch14_Lec4_nested_try {
    public static void main(String[] args) {
        int [] marks = {12,23,34,45,56,67};
        Scanner sc = new Scanner(System.in);
        boolean big = true;
        while (big){
            System.out.print("Enter the index number: ");
            int index = sc.nextInt();
            try {
                System.out.println("This is Nested try catch block...");
                try{
                    System.out.println("Number at entered index is: "+marks[index]);
                    big = false;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Exception 2 is appearing...");
                    System.out.println(e);
                }
            }
            catch (Exception e){
                System.out.println("exception 1 is appearing...");
                System.out.println(e);
            }
        }
        System.out.println("This program had ran properly... ");
    }
}
