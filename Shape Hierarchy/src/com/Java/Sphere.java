package com.Java;

public class Sphere implements ThreeDimensionalShape{
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea()
    {
        return Math.PI * 4 * (radius * radius);
    }

    public double getVolume()
    {
        return (4.0/3.0) * Math.PI * (radius * radius * radius);
    }
}
