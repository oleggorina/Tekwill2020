package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int distance = sc.nextInt();
	    int hours = sc.nextInt();
	    int speed = distance/hours;
        System.out.println(speed + " km");
    }
}
