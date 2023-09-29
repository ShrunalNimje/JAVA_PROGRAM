package com.company;

import java.io.FileWriter;

@Deprecated
class MyDeprecated{
    public void meth(){
        System.out.println(" I am Meth");
    }
}

interface MyInt{
    public void Int();
}

public class Advanced_Ch2_Ps2 {
    public static void main(String[] args) {
        // Advanced practice set 2

        // Problem 1 - Create a class and a method with deprecated annotation. What is its effect on program execution ?
        // problem 2 - Suppress the warning generated in question number 2
        @SuppressWarnings("Deprecation")
        MyDeprecated md = new MyDeprecated();
        md.meth();

        // Problem 3 - Create an interface and generate an instance from it.
        MyInt mi = new MyInt() {
            @Override
            public void Int() {
                System.out.println("i am Int of anonymous class");
            }
        };
        mi.Int();

        // Another method of problem 3 by using lambda
//        MyInt mi = ()->{
//            System.out.println("I am Int with use of lambda");
//        };
//        mi.Int();

        // problem 4 -  Write a Java program to generate a multiplication table of a given number and write it to a file
        try {
            FileWriter fw = new FileWriter("MultiplicationTable of 2.txt");
            fw.write("Multiplication table is :\n");
            int num = 2;
            int mul = 1;
            for (int j = 1;j <= 10;j++){
                fw.write(num+" X "+j+" = "+ num*j+"\n");
                mul*=j;
            }
            fw.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

        // Problem 5 - Repeat 5) with number 2 to 5 and save all this multiplication table to a folder
        try {
            FileWriter fw = new FileWriter("MultiplicationTable of 3.txt");
            fw.write("Multiplication table is :\n");
            int num = 3;
            int mul = 1;
            for (int j = 1;j <= 10;j++){
                fw.write(num+" X "+j+" = "+ num*j+"\n");
                mul*=j;
            }
            fw.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

        try {
            FileWriter fw = new FileWriter("MultiplicationTable of 4.txt");
            fw.write("Multiplication table is :\n");
            int num = 4;
            int mul = 1;
            for (int j = 1;j <= 10;j++){
                fw.write(num+" X "+j+" = "+ num*j+"\n");
                mul*=j;
            }
            fw.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

        try {
            FileWriter fw = new FileWriter("MultiplicationTable of 5.txt");
            fw.write("Multiplication table is :\n");
            int num = 5;
            int mul = 1;
            for (int j = 1;j <= 10;j++){
                fw.write(num+" X "+j+" = "+ num*j+"\n");
                mul*=j;
            }
            fw.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
