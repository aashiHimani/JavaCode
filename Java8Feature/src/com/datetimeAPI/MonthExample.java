package com.datetimeAPI;

import java.time.Period;
import java.time.YearMonth;

public class MonthExample {
    public static void main(String[] args) {
        YearMonth obj1=YearMonth.now();
        YearMonth obj2=obj1.plus(Period.ofYears(0));
        System.out.println(obj2);

        YearMonth obj3=obj1.minus(Period.ofYears(3));
        System.out.println(obj3);
    }
}
