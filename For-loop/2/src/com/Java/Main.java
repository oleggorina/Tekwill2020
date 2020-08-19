package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        ArithmeticAverage arithmeticAverage = new ArithmeticAverage(a,b);
        System.out.println(arithmeticAverage.Average());
    }
}
