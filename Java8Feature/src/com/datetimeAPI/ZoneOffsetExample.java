package com.datetimeAPI;

import java.time.ZoneOffset;

public class ZoneOffsetExample {
    public static void main(String[] args) {
        ZoneOffset zone=ZoneOffset.ofHoursMinutes(7,15);
        System.out.println(zone);

        ZoneOffset zone1=ZoneOffset.ofHours(4);
        System.out.println(zone1);
    }
}
