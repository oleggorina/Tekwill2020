package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = sum(scanner.nextInt());
        System.out.println(sum);
    }

    public static long sum (int s)
    {
        if (s == 1)
        {
            return 1;
        }
        return s + sum(s -1);
    }
}
