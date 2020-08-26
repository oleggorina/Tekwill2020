package com.Java;

import java.util.Scanner;
import java.util.function.LongUnaryOperator;

public class Main {

    public static void main(String[] args) {

        System.out.println(Operator.binaryOperator.applyAsInt(4, 3));
        System.out.println(Operator.binaryOperator.applyAsInt(3, 3));
        System.out.println(Operator.binaryOperator.applyAsInt(-5, 9));
    }
}
