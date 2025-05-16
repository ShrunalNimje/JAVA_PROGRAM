package com.company;

class NegativeRadiusException extends Exception{
    public String toString(){
        return "There is an Negative Exception...";
    }

    public String toMessage(){
        return "There is an Negative Exception...";
    }
}

class ZeroRadiusException extends Exception{
    public String toString(){
        return "There is a Zero Exception...";
    }

    public String toMessage(){
        return "There is a Zero Exception...";
    }
}

public class Ch14_Lec6_throw_throws {
    public static double area(int r) throws NegativeRadiusException, ZeroRadiusException {
        if (r<0){
            throw new NegativeRadiusException();
        }

        if (r==0){
            throw new ZeroRadiusException();
        }
        return Math.PI*r*r;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a/b;
    }

    public static void main(String[] args) {

        try {
            int c = divide(230,0);
            System.out.println("Division is :" + c);
        }
        catch (Exception e){
            System.out.println("There is an Exception...");
            System.out.println(e);
        }

        try {
            double d = area(0);
            System.out.println("Area is :" + d);
        }
        catch (Exception e){
            System.out.println("Throws an Exception...");
            System.out.println(e);

        }
    }
}
