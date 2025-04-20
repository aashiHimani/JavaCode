package com.datetimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDateTime localDate=LocalDateTime.now();
        DateTimeFormatter dateformatter=DateTimeFormatter.ofPattern("MM dd, YYYY");
        System.out.println(dateformatter.format(localDate));

        LocalDate dt1=LocalDate.parse("2021-01-07");
        LocalDate result=dt1.withDayOfYear(01);
        System.out.println("The date with day of year is:"+result);
    }
}
