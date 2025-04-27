package com.datetimeAPI;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantMethodExample {
    public static void main(String[] args) {
        Clock clock=Clock.systemDefaultZone();
        Instant instantObj=clock.instant();
        System.out.println("Instant for class "+clock+" is "+instantObj);
        ZoneId zoneId=ZoneId.of("Europe/Paris");

        Clock clock1=Clock.system(zoneId);
        Instant instantObj1=clock1.instant();
        ZonedDateTime time1=instantObj1.atZone(clock.getZone());
        System.out.println("Instant for class "+clock+ " is "+time1.toString());
    }
}
