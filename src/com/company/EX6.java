package com.company;
import java.util.Scanner;
class InvalidIpException extends Exception{
    public String tostring(){
        return "Entered input is invalid \n Please check before proceed...";
    }
    public String tomessage(){
        return "To message...";
    }
}
class ZeroIpException extends Exception{
    public String tostring(){
        return "You cannot divide by 0(Zero)\n Please check before proceed...";
    }
    public String tomessage(){
        return "To message...";
    }
}
class MaxMultiplierException extends Exception{
    public String tostring(){
        return "You cannot multiply greater than 7000 value\n Please check before proceed...";
    }
    public String tomessage(){
        return "To message...";
    }
}
class MaxIpException extends Exception{
    public String tostring(){
        return "You cannot get number greater than 100000 \n Please check before proceed...";
    }
    public String tomessage(){
        return "To message...";
    }
}
class MyCustomCalculator{
    public double addition(double a, double b) throws InvalidIpException, MaxIpException{
        if (a>100000 || b>100000){
            throw new MaxIpException();
        }
        if (a==0 && b==0){
            throw new InvalidIpException();
        }
        return a+b;
    }
    public double subtraction(double a, double b) throws InvalidIpException, MaxIpException{
        if (a>100000 || b>100000){
            throw new MaxIpException();
        }
        if (a==0 && b==0){
            throw new InvalidIpException();
        }
        return a-b;
    }
    public double multiplication(double a, double b) throws InvalidIpException, MaxMultiplierException{
        if (a>7000 || b>7000){
            throw new MaxMultiplierException();
        }
        if (a==0 && b==0){
            throw new InvalidIpException();
        }
        return a*b;
    }
    public double division(double a, double b) throws InvalidIpException, ZeroIpException{
        if (b==0){
            throw new ZeroIpException();
        }
        if (a==0 && b==0){
            throw new InvalidIpException();
        }
        return a/b;
    }
}
public class EX6 {
    public static void main(String[] args) throws InvalidIpException, ZeroIpException, MaxIpException, MaxMultiplierException{

        /*
        Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
         */

        MyCustomCalculator calc = new MyCustomCalculator();
        System.out.println("Addition is : " + calc.addition(34.6, 67));
        System.out.println("Division is : " + calc.division(23.6, 2));
        System.out.println("Multiplication is : " + calc.multiplication(34,4567));
        System.out.println("Subtraction is : " + calc.subtraction(234,0));
        System.out.println("The program has been ended...");


    }
}
