package com.datetimeAPI;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {
    public static void main(String[] args) {
        Duration duration=Duration.between(LocalTime.NOON,LocalTime.MIDNIGHT);
        System.out.println(duration.get(ChronoUnit.SECONDS));
        Duration absDuration=duration.abs();
        System.out.println(absDuration.get(ChronoUnit.SECONDS));

        Duration duration1=Duration.from(ChronoUnit.HOURS.getDuration());
        System.out.println(duration1.toMinutes());
    }
}
