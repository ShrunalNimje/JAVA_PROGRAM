package com.company;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
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

    }
}
