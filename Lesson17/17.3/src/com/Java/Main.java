package com.Java;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();

        LocalDate first = LocalDate.of(year, month, 1);
        LocalDate last = LocalDate.of(year,month, first.lengthOfMonth());

        System.out.println(first + " " + last);
    }
}
