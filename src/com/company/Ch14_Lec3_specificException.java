package com.company;

import java.util.Scanner;

public class Ch14_Lec3_specificException {
    public static void main(String[] args) {

        int [] marks = {12,23,34,45,56,67};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index number: ");
        int ind = sc.nextInt();

        System.out.print("Enter the number you want to divide: ");
        int num = sc.nextInt();

        try {
            System.out.println("number at entered index is:"+marks[ind]);
            System.out.println("The division is :"+marks[ind]/num);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred");
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occurred");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other exception occurred");
            System.out.println(e);
        }

    }
}
