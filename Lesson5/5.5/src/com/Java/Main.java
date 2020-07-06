package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String type = sc.nextLine();

	    if (type.equals("circle"))
	    {
	        double r = sc.nextDouble();
            System.out.println((r*r)*3.14);
        }
	    else if (type.equals("triangle"))
	    {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double p = (a + b + c) /2;
            System.out.println(Math.sqrt(p * (p-a) * (p-b) * (p-c)));
        }
	    else if (type.equals("rectangle"))
	    {
	        double a = sc.nextDouble();
	        double b = sc.nextDouble();
            System.out.println(a*b);
        }
    }
}
