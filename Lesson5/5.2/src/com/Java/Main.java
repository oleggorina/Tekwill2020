package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();

	    if (num < 1)
        {
            System.out.println("No army");
        }

	    else if (num >= 1 && num <= 19)
        {
            System.out.println("Pack");
        }

	    else if (num >= 20 && num <= 249)
        {
            System.out.println("Throng");
        }

	    else if (num >= 250 && num <= 999)
        {
            System.out.println("Zounds");
        }

	    else if (num >= 1000)
        {
            System.out.println("Legion");
        }
    }
}
