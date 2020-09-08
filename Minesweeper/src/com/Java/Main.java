package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How mines do you want on the field ?: ");
        int nrOfMines = Integer.parseInt(sc.next());

        Frame.fillWithMines(nrOfMines);

        Frame.print();

    }
}
