package com.Java;

public class Triangle extends Shape{
    double height;
    double base;

    @Override
    public double area()
    {
        return (base * height) / 2;
    }
}
