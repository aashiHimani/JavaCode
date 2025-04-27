package com.datetimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjuster {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println("the current date is:"+date);
        LocalDate dayOfNextMonth=date.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("firstDayOfNextMonth:"+dayOfNextMonth );
        LocalDate nextSaturday=date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("next saturday from now is"+nextSaturday);
        LocalDate firstDay=date.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("firstDayOfMonth:"+firstDay);
        LocalDate lastDay=date.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("lastDayOfMonth:"+lastDay);
    }
}
