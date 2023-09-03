package com.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return "I am toString...";
    }
    @Override
    public String getMessage(){
        return "I am getMessage..";
    }
}

class AgeException extends Exception{
    @Override
    public String toString(){
        return "Age can't more than 200 years...";
    }
    @Override
    public String getMessage(){
        return "Please make sure your entered age is correct...";
    }
}

public class Ch14_lec5_Exception_class {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if (age>=125){
            try {
                System.out.println("This is an AgeException...");
                // throw new MyException();
                throw new AgeException();
            }
            catch (Exception e){
                // System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println(e);
            }
        }
        else {
            System.out.println("Your entered age is eligible to anything...");
        }

    }

}