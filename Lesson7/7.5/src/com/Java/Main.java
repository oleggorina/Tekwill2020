package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();

        int count = 0;
        int pos = 0;

        for (int i = 0; i < line1.length(); i++)
        {
            if (line1.charAt(i) == line2.charAt(pos))
            {
                pos++;
                if (pos == line2.length())
                {
                    count++;
                    pos = 0;
                }
            }
            else {
                pos = 0;
            }
        }

        System.out.println(count);
    }
}
