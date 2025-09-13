package com.company;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Advanced_Ch1_Lec7_Gregorian {
    public static void main(String[] args) {

        GregorianCalendar gc = new GregorianCalendar();

        System.out.println(gc.getTime());
        System.out.println("HashCode of this Calendar is : " + gc.hashCode());
        System.out.println("Current date is : "+ gc.get(Calendar.DATE)+"/"+gc.get(Calendar.MONTH)+"/"+gc.get(Calendar.YEAR));
        System.out.println(gc.getTimeZone());
        System.out.println(gc.get(Calendar.HOUR)+"/"+gc.get(Calendar.MINUTE)+"/"+gc.get(Calendar.SECOND)+"/"+gc.get(Calendar.MILLISECOND));
        System.out.println(gc.isLeapYear(2023));
        System.out.println("Available ID's are :");
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
        System.out.println(TimeZone.getAvailableIDs()[4]);
        // System.out.println(TimeZone.getAvailableIDs());
        System.out.println(Arrays.toString(Calendar.getAvailableLocales()));
        System.out.println(Arrays.toString(TimeZone.getAvailableIDs()));

    }
}
