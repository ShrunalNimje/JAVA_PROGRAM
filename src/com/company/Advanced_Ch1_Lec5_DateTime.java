package com.company;

import java.util.Date;

public class Advanced_Ch1_Lec5_DateTime {
    public static void main(String[] args) {

        System.out.println("Milliseconds passed since 1 Jan 1970 : " + System.currentTimeMillis());
        System.out.println("Seconds passed since 1 Jan 1970 : " + System.currentTimeMillis()/1000);
        // System.out.println("Minutes passed since 1 Jan 1970 : " + System.currentTimeMillis()/1000/60);
        System.out.println("Hours passed since 1 Jan 1970 : " + System.currentTimeMillis()/1000/3600);
        System.out.println("Days passed since 1 Jan 1970 : " + System.currentTimeMillis()/1000/3600/24);
        // System.out.println("Months passed since 1 Jan 1970 : " + System.currentTimeMillis()/1000/60/60/24/31);
        System.out.println("Years passed since 1 Jan 1970 : " + System.currentTimeMillis()/1000/3600/24/365);

        System.out.println("Maximum Long number is : " + Long.MAX_VALUE);
        System.out.println("Milliseconds passed is : " + System.currentTimeMillis());

        Date d1 = new Date();
        Date d2 = new Date(21,9,2023);

        System.out.println(d1.getTime());
        System.out.println(d1.getDate());
        System.out.println(d1.getDay());
        System.out.println(d1.getYear());

        System.out.println(d2.getYear());
        int ct = d1.compareTo(d2);
        System.out.println(ct);     // --> return -1 if d1 & d2 not equals...

        // Maximum methods are deprecated of Date class after java 8 update...
    }
}
