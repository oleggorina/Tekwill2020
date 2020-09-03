package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String str = scanner.nextLine();

        System.out.println(Converter.convertStringToDouble(str));
    }
}
