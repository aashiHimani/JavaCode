package com.datetimeAPI;

import java.time.*;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        String text="2011-10-02T14:45:30.123456789+05:30[Asia/Kolkata]";
        ZonedDateTime zone=ZonedDateTime.parse(text);
        System.out.println(zone);

        ZonedDateTime zone1=ZonedDateTime.parse(text);
        System.out.println(zone1.getZone());

        ZonedDateTime zone2=ZonedDateTime.parse(text);
        System.out.println(zone2);
        System.out.println(zone2.minus(Period.ofMonths(2)));
        System.out.println(zone2.plus(Period.ofMonths(2)));

        LocalDate date=LocalDate.now();
        LocalTime time=LocalTime.now();
        ZoneId zoneId=ZoneId.systemDefault();
        ZonedDateTime zonedatetime=ZonedDateTime.of(date, time, zoneId);
        System.out.println(zonedatetime);
    }
}
