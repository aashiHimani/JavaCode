package com.datetimeAPI;

import java.time.OffsetDateTime;

public class OffsetDateTimeExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime=OffsetDateTime.now();
        System.out.println(offsetDateTime);
        System.out.println("Year:"+offsetDateTime.getYear()+"|Month:"+offsetDateTime.getMonth()+"|Day:"+offsetDateTime.getDayOfWeek());

        OffsetDateTime offsetDateTime1=OffsetDateTime.now();
        System.out.println(offsetDateTime1);
        System.out.println("Hour:"+offsetDateTime.getHour()+"Minute:"+offsetDateTime.getMinute()+"Second:"+offsetDateTime.getSecond() +"NanoSecond:"+offsetDateTime.getNano());
    }
}
