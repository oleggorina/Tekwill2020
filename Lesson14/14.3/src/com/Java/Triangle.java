package com.Java;

public class Triangle extends Shape{
    private double length1;
    private double length2;
    private double length3;

    public Triangle(double length1, double length2, double length3)
    {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    @Override
    double getPerimeter() {
        return length1 + length2 + length3;
    }

    @Override
    double getArea() {
        double s = (length1 + length2 + length3) / 2.0d;
        double x = (s*(s-length1)*(s - length2)*(s-length3));
        return Math.sqrt(x);
    }
}
