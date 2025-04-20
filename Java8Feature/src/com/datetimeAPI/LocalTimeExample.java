package com.datetimeAPI;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime ltime=LocalTime.now();
        System.out.println("Local time value:"+ltime);

        LocalTime ltime1=LocalTime.now();
        LocalTime time1=ltime1.plusMinutes(120);
        System.out.println("Time:"+time1);

        LocalTime ltime2=LocalTime.now();
        LocalTime time2=ltime2.plusHours(05);
        System.out.println(time2);

        LocalTime ltime3=LocalTime.now();
        LocalTime time3=ltime3.minusMinutes(120);
        System.out.println(time3);
    }
}
