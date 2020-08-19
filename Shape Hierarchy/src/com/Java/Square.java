package com.Java;

public class Square implements TwoDimensiunalShape{
    private double length;

    public Square(double length)
    {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getArea()
    {
        return length * length;
    }

    public double getPerimeter()
    {
        return 4 * length;
    }
}
