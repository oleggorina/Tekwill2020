package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int result = 1;

        do {
            if (result % 1 == 0)
            {
                System.out.println(result * result);
                result++;
            }
        } while((result*result) < n);
    }
}
