package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        String formatterDate = myDate.format(formatter);

        System.out.println(formatterDate);
        System.out.println(myDate);
    }
}
