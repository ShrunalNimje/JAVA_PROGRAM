package com.company;

/**
 * This is a simple documentation
 * <br>
 * This class is to demonstrate what javadoc is and how it is used in the java industry
 * @author Shrunal Nimje
 * @version Java 20
 * @since 2023
 * @see <a href="https://docs.oracle.com/en/java/javase/20/docs/api/index.html"> Java Documentation <b>JavaDocs</b></a>
 */

public class Advanced_Ch2_Lec1_JavaDocs {
    public static int Add(int a, int b){
        return a+b;
    }

    public static int Subtract(int a, int b){
        return a-b;
    }

    public static int Multiply(int a, int b){
        return a*b;
    }

    public static int Division(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {

        System.out.println("Sum :"+ Add(2,5));
        System.out.println("Subtraction :"+ Subtract(5,1));
        System.out.println("Multiplication :"+ Multiply(5,10));
        System.out.println("Division :"+ Division(55,5));

    }
}
