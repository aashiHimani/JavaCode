package com.datetimeAPI;

import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;

public class OffsetTimeExample {
    public static void main(String[] args) {
        OffsetTime offset=OffsetTime.now();
        int h=offset.get(ChronoField.HOUR_OF_DAY);
        System.out.println(h);
        int m=offset.get(ChronoField.MINUTE_OF_DAY);
        System.out.println(m);
        int s=offset.get(ChronoField.SECOND_OF_DAY);
        System.out.println(s);

        OffsetTime offset1=OffsetTime.now();
        int h1=offset1.getHour();
        System.out.println(h1+" hours");

        OffsetTime offset2=OffsetTime.now();
        int m1=offset2.getMinute();
        System.out.println(m1+ " minutes");

        OffsetTime offset3=OffsetTime.now();
        int s1=offset3.getSecond();
        System.out.println(s1+ " seconds");

        OffsetTime offset4=OffsetTime.now();
        int n=offset.getNano();
        System.out.println(n+" nanoseconds");

        OffsetTime time=OffsetTime.of(LocalTime.now(),ZoneOffset.UTC);
        System.out.println(time);

        OffsetTime time1=OffsetTime.now();
        System.out.println(time1.toLocalTime());
    }
}
