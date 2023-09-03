package com.company;
import java.util.Scanner;
import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 0 for Stone , 1 for Paper , 2 for Scissor ");
        System.out.print("Enter your choice :");
        int userChoice = sc.nextInt();

        Random rd = new Random();
        int computerChoice = rd.nextInt(3);

        if (userChoice==computerChoice){
            System.out.println("Draw !");
        }
        else if ((userChoice==0 && computerChoice==2) || (userChoice==1 && computerChoice==0) || (userChoice==2 && computerChoice==1) ) {
            System.out.println("You won !");
        }
        else {
            System.out.println("Computer won !");
        }
        System.out.println("Computer Choice is:"+ computerChoice);

    }
}
