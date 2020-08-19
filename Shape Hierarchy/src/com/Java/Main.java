package com.Java;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(2);
    }
    public void showInfoShapeArea(Shape shape)
    {
        System.out.println(shape.getArea());
    }
}
