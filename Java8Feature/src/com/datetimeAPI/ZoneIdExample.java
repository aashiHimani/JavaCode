package com.datetimeAPI;

import java.time.LocalTime;
import java.time.ZoneId;

public class ZoneIdExample {
    public static void main(String[] args) {
        ZoneId zoneid1=ZoneId.of("Asia/Kolkata");
        ZoneId zoneid2=ZoneId.of("Europe/London");
        LocalTime time1=LocalTime.now(zoneid1);
        LocalTime time2=LocalTime.now(zoneid2);
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time1.isBefore(time2));
    }
}
