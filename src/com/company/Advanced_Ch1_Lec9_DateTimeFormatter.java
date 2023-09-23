package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Advanced_Ch1_Lec9_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now(); // --> current date and time
        System.out.println("Current date with time : "+ ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd:MM:yyyy -- HH:mm:ss"); // --> Format to display
        String myDT = ldt.format(dtf); // --> Date & Time + Format
        System.out.println("Date & Time in Format of : "+myDT);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd:MM:yyyy");
        String myDT1 = ldt.format(dtf1);
        System.out.println("Date in Format of : "+myDT1);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm:ss");
        String myDT2 = ldt.format(dtf2);
        System.out.println("Time in Format of : "+myDT2);

        DateTimeFormatter dtf3 = DateTimeFormatter.ISO_DATE;
        String myDT3 = ldt.format(dtf3);
        System.out.println("Format of ISO DATE : " +myDT3);

        DateTimeFormatter dtf5 = DateTimeFormatter.BASIC_ISO_DATE;
        String myDT5 = ldt.format(dtf5);
        System.out.println("Format of BASIC ISO DATE : " +myDT5);

        DateTimeFormatter dtf6 = DateTimeFormatter.ISO_WEEK_DATE;
        String myDT6 = ldt.format(dtf6);
        System.out.println("Format of ISO WEEK DATE : " +myDT6);

        DateTimeFormatter dtf7 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String myDT7 = ldt.format(dtf7);
        System.out.println("Format of ISO LOCAL DATE & TIME : " +myDT7);

        DateTimeFormatter dtf8 = DateTimeFormatter.ISO_ORDINAL_DATE;
        String myDT8 = ldt.format(dtf8);
        System.out.println("Format of ISO ORDINAL DATE : " +myDT8);

    }
}
