package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
//        LocalDateTime myDate = LocalDateTime.now();
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        LocalDateTime myDate = LocalDateTime.now();

        DateTimeFormatter gmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter formatterWeekDay = DateTimeFormatter.ofPattern("EEEE dd, yyyy");
        DateTimeFormatter formatterWhole = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm");
        DateTimeFormatter formatterLocal = DateTimeFormatter.ofPattern("HH:mm 'on' dd-MMM-yyyy");

        String formatterGMT = gmtTime.format(gmt);
        String formatterDate = gmtTime.format(formatter);
        String formatterDateWeekName = gmtTime.format(formatterWeekDay);
        String formatterDateWhole = gmtTime.format(formatterWhole);
        String formatterDataLocal = myDate.format(formatterLocal);

        System.out.println(formatterDate);
        System.out.println(formatterGMT);
        System.out.println(formatterDateWeekName);
        System.out.println(formatterDateWhole);
        System.out.println();
        System.out.println(formatterDataLocal);

    }
}
