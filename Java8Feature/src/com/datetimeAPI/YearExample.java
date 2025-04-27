package com.datetimeAPI;

import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;

public class YearExample {
    public static void main(String[] args) {
        Year y=Year.now();
        System.out.println("Current year:"+y);
        Year y1=Year.of(2020);
        Year y2=Year.of(2022);
        LocalDate l=y.atDay(350);
        System.out.println("Local date:"+l);
        YearMonth ym=y.atMonth(6);
        System.out.println("Year and month:"+ym);
        System.out.println("Number of days:"+y.length());
        System.out.println("2021 is before 2022:"+y.isBefore(y2));
        System.out.println("2021 is after 2020:"+y.isAfter(y1));
        System.out.println("Hashcode of the year:"+y.hashCode());
        System.out.println("2020 is leap year:"+y1.isLeap());
        System.out.println("2021 - 155 years:"+y.minusYears(155));
        System.out.println("2021 + 145 years:"+y.plusYears(145));
    }
}
