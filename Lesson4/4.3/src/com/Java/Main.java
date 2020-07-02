package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    int number = sc.nextInt();
        int sum = 0;
        int currentDigit;

        currentDigit = number % 10;
        sum = sum + currentDigit;

        number = number / 10;

        currentDigit = number % 10;
        sum = sum + currentDigit;

        number = number / 10;

        currentDigit = number % 10;
        sum = sum + currentDigit;

        System.out.println(sum);

    }
}
