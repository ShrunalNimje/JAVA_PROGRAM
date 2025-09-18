package com.company;

import java.util.Scanner;

public class Ch4_Ps4 {
    public static void main(String[] args) {

        // practise set 4

        // Problem statement 1
        int a  = 15;
        if (a==20){
            System.out.println("I am 20");
        }
        else{
            System.out.println("I am not 20");
        }

        // problem statement 2
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mark of maths:");
        int mark1 = sc.nextInt();
        System.out.print("Enter mark of physics:");
        int mark2 = sc.nextInt();
        System.out.print("Enter mark of chemistry:");
        int mark3 = sc.nextInt();

        float per = (mark1+mark2+mark3)/3.f;

        if(mark1>35 && mark2>35 && mark3>35 && per>40){
            System.out.println("student is pass");
        }
        else {
            System.out.println("Student is fail");
        }

        // Problem Statement 3
        System.out.print("enter your income in L :");
        float income = sc.nextFloat();
        float tax = 0;

        if(income>=2.5 && income<5){
            tax+=income*0.05f;
        }
        else if (income>=5 && income<10) {
            tax+=income*0.15f;
        }
        else if (income>=10) {
            tax+=income*0.35f;
        }
        else {
            tax+=0;
        }
        System.out.println("Employee need to pay the tax amount of :"+tax);

        // problem statement 4
        System.out.print("Enter your choice :");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("you entered wrong choice");
        }

        // Problem statement 5
        System.out.print("Enter year :");
        int year = sc.nextInt();

        if(year % 400 == 0){
            System.out.println("leap year");
        }
        else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("leap year");
        }
        else {
            System.out.println("not a leap year");
        }

        // problem statement 6
        System.out.print("Enter your website:");
        String webSite = sc.next();
        if(webSite.endsWith(".com")){
            System.out.println("Its a commercial website");
        }
        else if (webSite.endsWith(".org")){
            System.out.println("Its a organisation website");
        }
        else if (webSite.endsWith(".in")){
            System.out.println("Its a indian website");
        }
        else{
            System.out.println("Its an invalid website");
        }

    }
}