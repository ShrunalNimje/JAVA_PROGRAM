package com.company;
import java.util.Random;
import java.util.Scanner;

class Game {

    public int randomNum;
    public int userNum;
    public int noOfGuesses = 0;

    // Constructor
    public Game(){
        Random r = new Random();
        randomNum = r.nextInt(0,100);
    }

    public void userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        userNum = sc.nextInt();
    }

    public boolean isCorrect(){
        noOfGuesses++;

        if (userNum==randomNum){
            System.out.printf("Your entered number is %d same as random number and you found it in %d attempts\n", userNum, noOfGuesses);
            return true;
        }
        else if(userNum>randomNum){
            System.out.println("Too high number take another chance...");
            return false;
        }
        else {
            System.out.println("Too low number take another chance...");
            return false;
        }
    }
}

public class EX3 {
    public static void main(String[] args) {

        /*
        Game should have the following methods:
        Constructor to generate the random number
        takeUserInput() to take a user input of number
        isCorrectNumber() to detect whether the number entered by the user is true
        getter and setter for noOfGuesses
        Use properties such as noOfGuesses(int), etc to get this task done!
         */

        Game gm = new Game();
        boolean bl = false;
        while ( !bl){
            gm.userInput();
            bl = gm.isCorrect();
        }
    }
}