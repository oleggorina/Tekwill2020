package com.Java;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}
