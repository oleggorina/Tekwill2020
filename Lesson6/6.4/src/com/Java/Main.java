package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeArray = sc.nextInt();
        int[] array = new int[sizeArray];
        int sequence = 0;
        int length = 0;

        for (int i = 1; i < array.length; i ++)
        {
            array[i] = sc.nextInt();
            if (array[i] > array[i-1])
            {
               length ++;
            }
            else {
                length = 1;
            }
            if (length > sequence)
            {
                sequence = length;
            }
        }
        System.out.println(sequence);

    }
}
