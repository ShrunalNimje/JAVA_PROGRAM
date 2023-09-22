package com.company;
import java.util.Calendar;

public class Advanced_Ch1_Lec6_Calender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println("Available types of Calendar are : " + Calendar.getAvailableCalendarTypes());
        System.out.println("We have "+c.getCalendarType()+" Calendar");
        System.out.println(c.getTime());
        System.out.println("Current time zone is : " + c.getTimeZone());
        System.out.println("Weeks in a year : " + c.getWeeksInWeekYear());
        System.out.println("Current Year is : "+ c.getWeekYear());
        c.add(Calendar.YEAR,8);
        System.out.println("After 8 years time is : "+ c.getTime());
        c.add(Calendar.YEAR,-16);
        System.out.println("before 16 years time is : "+ c.getTime());
        System.out.println("Minimum days in a first week : " + c.getMinimalDaysInFirstWeek());
        System.out.println("First day of a week is : " + c.getFirstDayOfWeek());
        System.out.println("Weeks in a Year : " + c.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Weeks in a months : " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("Days completed in a 2023 Year : " + c.get(Calendar.DAY_OF_YEAR));
        System.out.println("Days are in a current month : " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hours gone in a 22 Sep 2023 : " + c.get(Calendar.HOUR_OF_DAY));

    }
}
