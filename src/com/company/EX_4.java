package com.company;
class Library1{
    String [] books = new String[100];
    int noOfBooks = 0;
    public void addBooks(String a){
       books[noOfBooks]= a;
        System.out.println(a+" Book added to library successfully");
        noOfBooks++;
    }
    public void showAvailableBooks(){
        System.out.println("Available books are:");
        for (String a:books){
            if (a==null){
                continue;
            }
            System.out.println(a);
        }
    }
    public void issueBooks(String b){
        for (int i = 0;i<books.length;i++){
            if (books[i] == b){
                System.out.println(b+" book are issued");
                books[i]=null;
                return;
            }
        }
        System.out.println("this Book is not available");
    }
    public void returnBook(String d){
        //addBooks(d);

        for (String e: books){
            if (e==null){
                System.out.println("You have been returned "+d+" book successfully");
                books[noOfBooks] = d;
                return;
            }
        }
        System.out.println("This book is not from this library");

    }
}
public class EX_4 {
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books

        Library1 l = new Library1();
        l.addBooks("\"Java\"");
        l.addBooks("\"Python\"");
        l.addBooks("\"C++\"");
        l.addBooks("\"C\"");
        l.addBooks("\"Machine Learning\"");
        l.showAvailableBooks();
        l.issueBooks("\"Python\"");
        l.issueBooks("\"C++\"");
        l.issueBooks("\"JavaScript\"");
        l.showAvailableBooks();
        l.returnBook("\"Python\"");
        l.showAvailableBooks();

    }
}
