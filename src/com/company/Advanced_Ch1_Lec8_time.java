package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Advanced_Ch1_Lec8_time {
    public static void main(String[] args) {

        // Returns the current date using the system clock and default time-zone, not null
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        // ofYearDay method returns a LocalDate with the specified year and day-of-year.
        LocalDate ld1 = LocalDate.ofYearDay(2030,124);
        System.out.println(ld1);

        // The maximum supported LocalDate, '+999999999-12-31'. This could be used by an application as a "far future" date
        LocalDate ld2 = LocalDate.MAX;
        System.out.println(ld2);

        // The minimum supported LocalDate, '-999999999-01-01'. This could be used by an application as a "far past" date
        LocalDate ld3 = LocalDate.MIN;
        System.out.println(ld3);

        // This returns a LocalDate with the specified year, month and day-of-month
        LocalDate ld4 = LocalDate.of(2045,8,23);
        System.out.println(ld4);

        // Returns the current time using the system clock and default time-zone, not null
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        // The time of noon in the middle of the day,"12:00"
        LocalTime lt1 = LocalTime.NOON;
        System.out.println(lt1);

        // The time of midnight at the start of the day, "00:00"
        LocalTime lt2 = LocalTime.MIDNIGHT;
        System.out.println(lt2);

        // The minimum supported LocalTime, "00:00". This is the time of midnight at the start of the day
        LocalTime lt3 = LocalTime.MIN;
        System.out.println(lt3);

        // The maximum supported LocalTime, "23:59:59.999999999". This is the time just before midnight at the end of the day
        LocalTime lt4 = LocalTime.MAX;
        System.out.println(lt4);

        // This returns a LocalTime with the specified second-of-day. The nanosecond field will be set to zero.
        LocalTime lt5 = LocalTime.ofSecondOfDay(34567);
        System.out.println(lt5);

        // This returns a LocalTime with the specified hour, minute, second and nanosecond
        LocalTime lt6 = LocalTime.of(20,46,53,345634);
        System.out.println(lt6);

        // Returns the current date-time using the system clock and default time-zone, not null
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // The minimum supported LocalDateTime, '-999999999-01-01T00:00:00'. This is the local date-time just before midnight at the end of the maximum date.
        // This combines LocalDate.MAX and LocalTime.MAX. This could be used by an application as a "far future" date-time
        LocalDateTime ldt1 = LocalDateTime.MAX;
        System.out.println(ldt1);

        // The minimum supported LocalDateTime, '-999999999-01-01T00:00:00'. This is the local date-time of midnight at the start of the minimum date.
        // This combines LocalDate.MIN and LocalTime.MIN. This could be used by an application as a "far past" date-time.
        LocalDateTime ldt2 = LocalDateTime.MIN;
        System.out.println(ldt2);

        // This returns a LocalDateTime with the specified year, month, day-of-month, hour, minute, second and nanosecond
        LocalDateTime ldt3 = LocalDateTime.of(2045,8,23,4,34,34,12345);
        System.out.println(ldt3);

    }
}
