package com.Java;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringDate = sc.nextLine();

        LocalDate date = LocalDate.parse(stringDate);
        System.out.println(date.getDayOfYear() + " " + date.getDayOfMonth());
    }
}
