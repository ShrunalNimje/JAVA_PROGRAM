package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Advanced_Ch2_Lec6_File {
    public static void main(String[] args) {

        File f = new File("MyFile.txt");

        // Creating a new File
        try {
            f.createNewFile();
            System.out.println("The file has been successfully created!");
        }
        catch (IOException e){
            e.printStackTrace();
        }

        // Writing in a File
        try {
            FileWriter fw = new FileWriter("myFile.txt");
            fw.write("This is my first File \nWhich is created with the help of java File class");
            fw.write("\nFile handling is a crucial part of any programming language.");
            fw.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        // Reading a File
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()){
                String s = sc.nextLine();
                System.out.println(s);
            }
            sc.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        // Deleting a File
        try {
            f.delete();
            System.out.println("The File has been successfully deleted!");
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
