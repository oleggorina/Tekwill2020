package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int result = 1; // Nu sunt sigur ca este corect in asa mod, dar doar asa s-a primit sa afisez fara 0

        do {
            if (result % 1 == 0)
            {
                System.out.println(result * result);
                result++;
            }
        } while((result*result) < n);
    }
}
