package com.Java;

public class Circle implements TwoDimensiunalShape{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public double getPerimeter()
    {
        return Math.PI * 2 * radius;
    }
}
