package com.company;

import java.util.Date;

/**
 * This is a simple documentation
 * <br>
 * This class is to demonstrate what javadoc is and how it is used in the java industry
 * @author Shrunal Nimje
 * @version Java 20
 * @since 2023
 * @see <a href="https://docs.oracle.com/en/java/javase/20/docs/api/index.html"> Java Documentation <b>JavaDocs</b></a>
 */

public class Advanced_Ch2_Lec2_tags_of_methods {

    /**
     * This is a method of Add of our class
     * <br>
     * In which addition of two numbers return
     * @param a This is a First number of Add method
     * @param b This is a Second number of Add method
     * @return Sum of two number
     */

    public static int Add(int a, int b){
        return a+b;
    }

    /**
     * This is a method of Divide of our class
     * <br>
     * In which Division of two numbers return and may throw an Exception if b == 0
     * @param a This is a First number of Divide method
     * @param b This is a Second number of Divide method
     * @return Division of two number
     * @throws Exception throw Exception if b is equal to zero( b == 0 )
     */

    public static int Divide(int a, int b) throws Exception{
        if (b==0){
            throw new Exception();
        }
        return a/b;
    }

    /**
     * @deprecated The method of Date class is Deprecated
     * <br>
     * Please use another methods of Date class
     */

    Date d = new Date();

    public static void main(String[] args) throws Exception{
        System.out.println("Creating my own Java Documentation(Java Docs)");

        System.out.println("Addition : " + Add(2,5));
        System.out.println("Division : " + Divide(55,5));

        Date d = new Date();
        System.out.println(d.getHours());

    }
}
