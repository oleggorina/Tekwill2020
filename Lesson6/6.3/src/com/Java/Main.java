package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int sum = 0;

        for (int value: array)
        {
            if (value > n)
            {
                sum += value;
            }
        }

        System.out.println(sum);
    }
}
