package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    int num = sc.nextInt();

        System.out.println(num > 0 && num < 10);
    }
}
