package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[10];
        array(arr);
        binarySearch(arr);
    }

    public static void binarySearch(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(java.util.Arrays.binarySearch(arr, n));
    }

    public static void array (int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        java.util.Arrays.sort(arr);
    }
}
