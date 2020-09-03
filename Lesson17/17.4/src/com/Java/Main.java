package com.Java;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();

        LocalTime localTime = LocalTime.parse(time);

        System.out.print(localTime.getHour() + ":" + localTime.getMinute());
    }
}
