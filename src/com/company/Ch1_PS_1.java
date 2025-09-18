package com.company;

import java.util.Scanner;

public class Ch1_PS_1 {
    public static void main(String[] args) {

        // Quick Quiz 1

        // Program of add three numbers
        float a = 5.6f;
        float b = 6.9f;
        float c = 3.8f;
        System.out.println("the sum is three number is  : "+ (a+b+c));

        // exercise 1.1
        Scanner sc = new Scanner(System.in);
        System.out.print("the mark of sub1 is:");
        int sub1 = sc.nextInt();
        System.out.print("the mark of sub2 is:");
        int sub2 = sc.nextInt();
        System.out.print("the mark of sub3 is:");
        int sub3 = sc.nextInt();
        System.out.print("the mark of sub4 is:");
        int sub4 = sc.nextInt();
        System.out.print("the mark of sub5 is:");
        int sub5 = sc.nextInt();
        float sum = sub1+sub2+sub3+sub4+sub5;
        float per = sum/5;
        System.out.println("the percentage is :"+per);

        // practise set 1

        // Problem statement 1 : same as Quick quiz 1

        // problem statement 2
        Scanner sc1 = new Scanner(System.in);
        System.out.print("the mark of m1 is:");
        int m1 = sc1.nextInt();
        System.out.print("the mark of m2 is:");
        int m2 = sc1.nextInt();
        System.out.print("the mark of m3 is:");
        int m3 = sc1.nextInt();
        System.out.print("the mark of m4 is:");
        int m4 = sc1.nextInt();
        System.out.print("the mark of m5 is:");
        int m5 = sc1.nextInt();
        float sum1 = m1+m2+m3+m4+m5;
        float cgpa =sum1/5;
        System.out.println("the percentage is :"+cgpa);

        // problem statement 3
        System.out.println("enter your name :");
        String name = sc1.next();
        System.out.println("hello " + name + " have a great day !");

        // problem statement 4
        System.out.print("enter length in km :");
        float km = sc.nextFloat();
        float miles = 0.621371f;
        System.out.println("length in miles is "+ km*miles);

        // problem statement 5
        System.out.println("enter your integer :");
        System.out.println("this is : "+ sc.hasNextInt());

    }
}
