package com.datetimeAPI;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantExample {
    public static void main(String[] args) {
        Instant inst1=Instant.parse("2021-02-09T11:19:42.12Z");
        System.out.println("Parsed instant is:"+inst1);
        System.out.println(inst1.isSupported(ChronoUnit.DAYS));
        System.out.println(inst1.isSupported(ChronoUnit.YEARS));
        Instant cur=Instant.now();
        System.out.println("Current Instant is:"+cur);
        Instant diff=inst1.minus(Duration.ofDays(70));
        System.out.println("Instant after subtraction:"+diff);
        Instant sum=inst1.plus(Duration.ofDays(10));
        System.out.println("Instant after addition:"+sum);
    }
}
