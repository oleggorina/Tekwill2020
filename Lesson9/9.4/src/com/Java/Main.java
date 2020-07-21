package com.Java;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[10];
        array(arr);
        binarySearch(arr);
    }

    public static void binarySearch(int[] arr)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(java.util.Arrays.binarySearch(arr, n));
    }

    public static void array (int[] arr)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
}
