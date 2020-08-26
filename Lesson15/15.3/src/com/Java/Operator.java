package com.Java;

import java.util.function.IntBinaryOperator;

public class Operator {
    public static IntBinaryOperator binaryOperator = (a, b) -> a > b ? a : b;
}
