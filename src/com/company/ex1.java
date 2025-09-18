package com.company;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        // exercise 1.1
        Scanner sc = new Scanner(System.in);
        System.out.print("the marks of 5 subjects are : ");

        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();

        float sum = sub1+sub2+sub3+sub4+sub5;
        float per = sum/5;

        System.out.println("the percentage is :"+per);
    }
}
