package com.company;
import java.util.Scanner;
class Library{
    String [] arrOfAvailableBooks ={"a","b","c","d","e","f","g","h","i","j"};
    String [] arrOfIssueBooks = {"e","f","g"};
    public int noOfBooks=0;
    public void showAvailableBooks(){
        for (int i=0;i< arrOfAvailableBooks.length;i++){
            noOfBooks++;
        }
        System.out.println(noOfBooks+" book are available");
    }
    public void addBooks(){
        System.out.print("Which book do you want to add in library:");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("I have successfully add "+s+" books to library");
    }
    public void issueBooks(){
        for (int i=0;i< arrOfAvailableBooks.length;i++){
            noOfBooks++;
        }
        System.out.println(noOfBooks+" book are available");
        System.out.print("Which book do you want to issue from a library:");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("I have successfully issue "+s+" books from library");
    }
    public void returnBooks(){
        for (int i=0;i< arrOfIssueBooks.length;i++){
            noOfBooks++;
        }
        System.out.println(noOfBooks+" book are issued");
        System.out.print("Which book do you want to return to a library:");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("you have successfully return "+s+" books to library");
    }
}
public class EX4 {
    public static void main(String[] args) {

        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books

       Library l = new Library();
        System.out.println("Enter: 1. add books \n 2. issue books \n 3.return books \n 4. show available books");
        System.out.print("Enter your choice:");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
                case 1:
                    l.addBooks();
                    break;
                case 2:
                    l.issueBooks();
                    break;
                case 3:
                    l.returnBooks();
                    break;
                case 4:
                    l.showAvailableBooks();
                    return;
                default:
                    System.out.println("Get lost from the library \n you are come here to just waste our time ");
        }
    }
}
