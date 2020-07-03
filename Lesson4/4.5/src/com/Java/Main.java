package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double distance = sc.nextDouble();
	    int hours = sc.nextInt();
	    double speed = distance/hours;
        System.out.println(speed + " km");
    }
}
