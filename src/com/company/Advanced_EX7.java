package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

class AddBooks{

    public String addBooks(String name, String author){
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("You have been successfully added book at this date & time : "+ ldt);
        return "Book and Author name is : " + name +" and "+ author;
    }
}

class IssueBooks{

    public String issueBooks(String name, String author){
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("You have been successfully issued book at this date & time : "+ ldt);
        return "Book and Author name is : " + name +" and "+ author;
    }
}

class ReturnBook{

    public String returnBooks(String name, String author){
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("You have been successfully return book at this date & time : "+ ldt);
        return "Book and Author name is : " + name +" and "+ author;
    }
}

public class Advanced_EX7 {
    public static void main(String[] args) {

           /*
        Create a library management system which is capable of issuing books to the students.
        Book should have info like:
        1. Book name
        2. Book Author
        3. Issued to
        4. Issued on
        User should be able to add books, return issued books, issue books
        Assume that all the users are registered with their names in the central database
         */

        System.out.println("Firstly you have to registered with your name ");
        System.out.print("Enter your name : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        ArrayList<String> al = new ArrayList<>();
        System.out.println("Available Books are : ");
        al.add("Marathi -- Mar");
        al.add("Hindi -- Hin");
        al.add("English -- Eng");
        al.add("Social Science -- SoSci");
        al.add("General Science -- GenSc");
        al.add("Geography -- Geo");
        al.add("Economics -- Eco");
        al.add("History -- His");
        al.add("General Knowledge -- GK");
        al.add("Mathematics -- Math");

        for (Object e:al) {
            System.out.println(e);
        }
        System.out.println("Only this books are available to issue from Library0012...");

        Boolean b1 = true;

        while (b1){
            System.out.println("Please enter : 1.Add books \n 2.Issue book \n 3.Return issued book");
            System.out.print("Please Enter your choice : ");
            Scanner sc2 = new Scanner(System.in);
            int Choice = sc2.nextInt();

            switch (Choice){
                case 1 :
                    AddBooks ab =new AddBooks();
                    System.out.println(ab.addBooks("Book 1","B1"));
                    System.out.println(ab.addBooks("Book 2","B2"));
                    System.out.println(ab.addBooks("Book 3","B3"));
                    System.out.println(ab.addBooks("Book 4","B4"));
                    System.out.println(ab.addBooks("Book 4","B5"));
                    break;
                case 2 :
                    IssueBooks ib =new IssueBooks();
                    System.out.println( ib.issueBooks("Marathi","Av"));
                    System.out.println( ib.issueBooks("Social Science","SoSci"));
                    System.out.println( ib.issueBooks("Geography","Geo"));
                    break;
                case 3 :
                    ReturnBook rb =new ReturnBook();
                    System.out.println(rb.returnBooks("Mathematics","Math"));
                    System.out.println(rb.returnBooks("History","His"));
                    System.out.println(rb.returnBooks("English","Eng"));
                    break;
                default :
                    System.out.println("Your entered choice is incorrect \n You are not able to Add, Issue & Return any of these...\n Thank You!");
                    b1 = false;
            }
        }
    }
}
