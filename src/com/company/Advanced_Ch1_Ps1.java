package com.company;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Advanced_Ch1_Ps1 {
    public static void main(String[] args) {
        // Advanced practice set 1

        // Problem 1- Create an ArrayList and store the names of ten students inside it. Print it using a for each loop
        ArrayList<String> al = new ArrayList<>(10);
        al.add("Name of the Bhagwan's are: ");
        al.add("Dev ke dev Mahadev");
        al.add("Radha");
        al.add("Lakshmi");
        al.add("Vishnu");
        al.add("Shri Ram");
        al.add("Ganesh");
        al.add("Shankar");
        al.add("Parvati");
        al.add("Shri Krishna");

        for (Object e:al) {
            System.out.println(e);
        }

        // Problem 2- Use the Date class in Java to print the time in the following format : 21:47:02
        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        // Problem 3- Repeat 2) using the Calendar class
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        // Problem 4- Repeat 2) using java.time API
        LocalTime lt = LocalTime.now();
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("HH:mm:ss");
        // DateTimeFormatter dft1 = DateTimeFormatter.ofPattern("hh:mm:ss");
        String s = lt.format(dft);
        // String s1 = lt.format(dft1);
        System.out.println(s);
        // System.out.println(s1);

        // Problem 5- Create a Set in java. Try to store the duplicate values elements inside this set and verify that only one instance is stored
        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(34);
        hs.add(56);
        hs.add(24);
        hs.add(78);
        hs.add(34);
        System.out.println(hs);
        // it is clear that, the duplicate elements inside this set are print only one time

    }
}
