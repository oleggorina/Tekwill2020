package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String city = sc.nextLine();
	    boolean isBurg = false;

         if (city.contains("burg"))
            {
                isBurg = true;
            }
        System.out.println(isBurg);

    }
}
