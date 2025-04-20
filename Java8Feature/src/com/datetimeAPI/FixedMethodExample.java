package com.datetimeAPI;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class FixedMethodExample {
    public static void main(String[] args) {
        Instant instant=Instant.parse("2018-08-19T16:02:42.00Z");
        ZoneId zoneId=ZoneId.of("Asia/Calcutta");
        Clock clock=Clock.fixed(instant, zoneId);
        System.out.println(clock);

        Instant instant1=Instant.now();
        ZoneId zoneId1=ZoneId.systemDefault();
        Clock clock1=Clock.fixed(instant1, zoneId1);
        System.out.println(clock1);
    }
}
