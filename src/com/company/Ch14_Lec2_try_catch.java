package com.company;

public class Ch14_Lec2_try_catch {
    public static void main(String[] args) {
        int a = 9000;
        int b = 0;

        // Without try catch block
        int c = a/b;
        System.out.println("division is :"+c);

        // With try catch block
        try {
            int c1 = a/b;
            System.out.println("division is :"+c1);
        }
        catch (Exception e){
            System.out.println("Sorry , There is found an Exception. Reason:");
            System.out.println(e);
        }
    }
}
