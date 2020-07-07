package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num;
	    int length = 0;

	    do {
            num = sc.nextInt();
            length ++;

        } while (num != 0);
            length --;
        System.out.println(length);
    }
}
