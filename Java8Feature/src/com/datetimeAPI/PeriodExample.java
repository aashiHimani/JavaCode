package com.datetimeAPI;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;

public class PeriodExample {
    public static void main(String[] args) {
        Period p1=Period.ofMonths(6);
        Period p2=p1.minus(Period.ofMonths(2));
        System.out.println(p2);

        Period p=Period.ofDays(24);
        Temporal temp=p.addTo(LocalDate.now());
        System.out.println(temp);
    }
}
