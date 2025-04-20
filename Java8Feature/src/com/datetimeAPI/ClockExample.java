package com.datetimeAPI;

import java.time.Clock;

public class ClockExample {
    public static void main(String[] args) {
        Clock clock=Clock.systemUTC();
        System.out.println("UTC time="+clock.instant());

        Clock clock1=Clock.systemDefaultZone();
        System.out.println(clock1);
        System.out.println("Time Zone :"+clock1.getZone());
    }
}
