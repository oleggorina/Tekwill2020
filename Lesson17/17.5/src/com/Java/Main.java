package com.Java;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        int hour = sc.nextInt();
        int minutes = sc.nextInt();

        LocalTime localTime = LocalTime.parse(time);

        System.out.println(localTime.minusHours(hour).minusMinutes(minutes));

    }
}
