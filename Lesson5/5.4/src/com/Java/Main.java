package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String st = sc.nextLine();

	    switch (st)
        {
            case "gryffindor":
                System.out.println("bravery");
                break;

            case "hufflepuff":
                System.out.println("loyalty");
                break;

            case "slytherin":
                System.out.println("Cunning");
                break;

            case "ravenclaw":
                System.out.println("Intellect");
                break;
            default:
                System.out.println("Not a valid house");
        }
    }
}
