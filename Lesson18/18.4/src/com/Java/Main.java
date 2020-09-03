package com.Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> results = new ArrayList<>();

        int nr = 1;

        while (nr != 0) {
            String input = sc.nextLine();
            try {
                nr = Integer.parseInt(input);
                if (nr != 0) {
                    results.add(String.valueOf(nr * 10L));
                }
            } catch (NumberFormatException ex) {
                results.add("Invalid user input: " + input);
            }
        }

        results.forEach(System.out::println);
    }
}
