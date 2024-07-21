package com.jspider.java8features.dateandtimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(ZoneId.getAvailableZoneIds());
        System.out.println(LocalTime.now(ZoneId.of("America/Cuiaba")));
        System.out.println(LocalDate.of(1999,8,23));
        System.out.println(LocalDateTime.now());
    }
}
