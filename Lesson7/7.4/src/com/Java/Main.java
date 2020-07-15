package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String date = sc.nextLine();
		String s ="/";
	    String[] dateArr = date.split("-");

	    String result = String.format("%s%s%s%s%s",dateArr[1], s,
				dateArr[2], s, dateArr[0]);

        System.out.println(result);

    }
}
