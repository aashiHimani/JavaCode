package com.datetimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime now=LocalDateTime.now();
        System.out.println(now);
        LocalDateTime localDateTime1=now.plusYears(1).plusMonths(1).plusWeeks(1).plusDays(1);
        System.out.println(localDateTime1);

        LocalDateTime localDateTime2=localDateTime1.minusYears(1).minusMonths(1).minusWeeks(1).minusDays(1);
        System.out.println(localDateTime2);

        LocalDateTime localDateTime3=localDateTime2.plusHours(1).plusMinutes(1).plusSeconds(1).plusNanos(100);
        System.out.println(localDateTime3);

        LocalDateTime localDateTime4=localDateTime3.minusHours(1).minusMinutes(1).minusSeconds(1).minusNanos(100);
        System.out.println(localDateTime4);

        LocalDateTime l1=LocalDateTime.of(2021, 04, 24, 14, 33, 48, 123456789);
        System.out.println(l1);
        LocalDateTime l2=LocalDateTime.of(2021, Month.APRIL, 24, 14, 33, 48, 123456789);
        System.out.println(l2);
        LocalDateTime l3=LocalDateTime.of(2021, Month.APRIL, 24, 14, 33, 48);
        System.out.println(l3);
        LocalDateTime l4=LocalDateTime.of(2021, Month.APRIL, 24, 14, 33);
        System.out.println(l4);
        LocalDate date=LocalDate.of(2021, 04, 24);
        LocalTime time=LocalTime.of(10, 34);
        LocalDateTime l5=LocalDateTime.of(date, time);
        System.out.println(l5);

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");
        LocalDateTime l=LocalDateTime.now();
        String dateTimeString=l.format(formatter);
        System.out.println(dateTimeString);
    }
}
