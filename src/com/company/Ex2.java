package com.company;
import java.util.Scanner;
import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 0 for Stone , 1 for Paper , 2 for Scissor ");

        int computerChoice = 0;
        int userChoice;

        int a = 3;
        int b = 3;

        while(a > 0 && b > 0){

            System.out.print("Your choice : ");
            userChoice = sc.nextInt();

            Random rd = new Random();
            computerChoice = rd.nextInt(3);

            System.out.println("Computer choice : "+ computerChoice);

            if (userChoice==computerChoice){
                System.out.println("Draw !");
            }
            else if ((userChoice==0 && computerChoice==2) || (userChoice==1 && computerChoice==0) || (userChoice==2 && computerChoice==1) ) {
                System.out.println("You won !");
                b--;
            }
            else {
                System.out.println("Computer won !");
                a--;
            }
        }

        if(a <= 0){
            System.out.println("You loss this game more than 2 times that's why I disqualify you!");
        }
        else {
            System.out.println("You win this game more than 2 times that's why I qualify you!");
        }
    }
}
