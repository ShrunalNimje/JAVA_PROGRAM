package com.company;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Problem 1 - count of digit in a number
        System.out.print("Enter number : ");
        int number = scanner.nextInt();
        int result = number;
        int count = 0;

        while (number > 0){
            count++;
            number /= 10;
        }
        System.out.println("Count of " +result + " is " + count);

        // problem 2 - Sum of digits of a number
        System.out.print("Enter number : ");
        int number1 = scanner.nextInt();
        int result1 = number1;
        int sum = 0;

        while (number1 > 0){
            sum += number1 % 10;
            number1 /= 10;
        }
        System.out.println("Sum of " +result1 + " is " + sum);

        // problem 3 - reversing digit of a number
        System.out.print("Enter number : ");
        int number2 = scanner.nextInt();
        int result2 = number2;
        int reverse = 0;

        while (number2 > 0){
            reverse = number2 % 10;
            number2 /= 10;
            System.out.print(reverse);
        }
        System.out.println();

        // problem 4 - sum of a given series ( 1-2+3-4.....n )
        System.out.print("Enter number : ");
        int number3 = scanner.nextInt();
        int result3 = number3;
        int sumOfSeries = 0;

        for (int i = 1; i <= number3; i++){
            if (i % 2 == 0){
                sumOfSeries -=i;
            }
            else {
                sumOfSeries += i;
            }
        }
        System.out.println("Sum of series of number " + result3 + " is " + sumOfSeries);

        // problem 5 - first n factorial
        System.out.print("Enter number : ");
        int number4 = scanner.nextInt();
        int result4 = number4;
        int factorial = 1;

        for (int i = 1; i <= number4; i++){
            factorial *= i;
        }
        System.out.println("Factorial of " + result4 + " is " + factorial);

        // problem 6 - find 'a' raised to power 'b'
        System.out.print("Enter two numbers : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = 1;
        for (int i = 1; i <=b; i++){
            c *= a;
        }
        System.out.println(a + " to the power "+ b + " is " + c);

        // problems using nested loops for patterns

        // problem 1 - rectangular pattern of '*'
        System.out.println("Enter no. of rows and columns : ");
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= column; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // problem 2 - hollow rectangular pattern of '*'
        System.out.println("Enter no. of rows and columns : ");
        int row1 = scanner.nextInt();
        int column1 = scanner.nextInt();

        for (int i = 1; i <= row1; i++){
            for (int j = 1; j <= column1; j++){
                if (i == 1 || i ==row1 || j == 1 || j == column1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // problem 3 - triangular pattern of '*'
        System.out.println("Enter no. of rows : ");
        int row2 = scanner.nextInt();

        for (int i = 1; i <= row2; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // problem 4 - inverted triangular pattern of '*'
        System.out.println("Enter no. of rows : ");
        int row3 = scanner.nextInt();

        for (int i = row3; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // problem 5 - pyramid pattern of '*'
        System.out.println("Enter no. of rows : ");
        int row4 = scanner.nextInt();

        for (int i = 1; i <= row4; i++){
            for (int j = 1; j <= row4-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // problem 6 - numerical rectangular pattern
        /*  1234
            2341
            3412
            4123
         */
        System.out.println("Enter no. of rows : ");
        int row5 = scanner.nextInt();
        for (int i = 1; i <= row5; i++){
            for (int j = i; j <= row5; j++){
                System.out.print(j);
            }
            for (int k = 1; k <= i-1; k++){
                System.out.print(k);
            }
            System.out.println();
        }

        // problem 7 - number pattern
        /*
            121212
            212121
            121212
            212121
         */
        System.out.println("Enter no. of rows and columns : ");
        int row6 = scanner.nextInt();
        int column7 = scanner.nextInt();

        for (int i = 1; i <= row6; i++){
            for (int j = 1; j <= column7; j++){
                if ((i+j) % 2 == 0){
                    System.out.print("1");
                }
                else {
                    System.out.print("2");
                }
            }
            System.out.println();
        }

        // problem 8 - numerical triangular pattern
        /*
            1
            12
            123
            1234
            12345
         */
        System.out.println("Enter no. of rows : ");
        int row7 = scanner.nextInt();

        for (int i = 1; i <= row7; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // problem 9 - numerical pyramid pattern
        /*
              1
             121
            12321
           1234321
         */
        System.out.println("Enter no. of rows : ");
        int row8 = scanner.nextInt();
        for (int i = 1; i <= row8; i++){
            for (int j = 1; j <= (row8-i); j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print(k);
            }
            for (int l = (i-1); l >= 1; l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
