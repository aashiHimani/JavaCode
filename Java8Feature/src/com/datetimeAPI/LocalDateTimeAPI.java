package com.datetimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeAPI {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        System.out.println("current date is:"+localDate);
        LocalTime localTime=LocalTime.now();
        System.out.println("current time is:"+localTime);
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println("current date time is:"+localDateTime);
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatedDateTime=localDateTime.format(dateTimeFormatter);
        System.out.println("in formatted manner:"+formatedDateTime);

        Month month=localDateTime.getMonth();
        int day=localDateTime.getDayOfMonth();
        int second=localDateTime.getSecond();
        System.out.println("month:"+month+" day:"+day+" second:"+second);

        LocalDate localDate1=LocalDate.of(1999,4,15);
        System.out.println("my birthday is:"+localDate1);

        LocalDateTime localDateTime1=localDateTime.withDayOfMonth(24).withYear(2016);
        System.out.println("specific date with current time:"+localDateTime1);
    }
}
