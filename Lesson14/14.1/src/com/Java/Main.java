package com.Java;

public class Main {

    public static void main(String[] args) {
        Addition addition = new Addition(10,15);
        System.out.println(addition.perform());

        Multiplication multiplication = new Multiplication(7,13);
        System.out.println(multiplication.perform());
    }
}
