package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();

	    switch (num)
        {
            case 1:
                System.out.println("up");
                break;
            case 2:
                System.out.println("down");
                break;
            case 3:
                System.out.println("left");
                break;
            case 4:
                System.out.println("right");
                break;
            case 0:
                System.out.println("do not move");
                break;
            default:
                System.out.println("error!");
        }
    }
}
