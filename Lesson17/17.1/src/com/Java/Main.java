package com.Java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        LocalDate dateBefore = LocalDate.parse(str).minusYears(30);
        LocalDate dateAfter = LocalDate.parse(str).plusYears(30);

        System.out.println(dateBefore);
        System.out.println(dateAfter);
    }
}
