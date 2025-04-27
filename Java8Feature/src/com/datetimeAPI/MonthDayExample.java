package com.datetimeAPI;

import java.time.Month;
import java.time.MonthDay;

public class MonthDayExample {
    public static void main(String[] args) {
        MonthDay monthday = MonthDay.of(Month.MARCH, 14);
        System.out.println(monthday);
        MonthDay monthday1 = MonthDay.parse("--03-14");
        System.out.println(monthday1.getMonth());
    }
}
