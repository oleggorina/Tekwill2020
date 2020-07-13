package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = line1.replace('a', 'b');

        System.out.println(line2);

    }
}
