package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String result = String.valueOf(line.charAt(0));
        int count = 1;

        for (int i = 1; i < line.length(); i++) {
            if (line.charAt(i-1) == line.charAt(i)) {
                count++;
            } else {
                result += count + String.valueOf(line.charAt(i));
                count = 1;
            }
        }
        System.out.printf("%s%d", result, count);

    }
}
