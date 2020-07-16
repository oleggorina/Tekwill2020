package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Integer.parseInt(sc.nextLine().trim());
        System.out.println(factorial(n));
    }

    public static long factorial (long n)
    {
       int res = 1;
       for (int i = 1; i <= n; i++)
       {
           res *= i;
       }
       return res;
    }
}
