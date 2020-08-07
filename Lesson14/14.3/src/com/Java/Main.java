package com.Java;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(10.0);
        System.out.println(circle.getPerimeter() + " - " + circle.getArea());

        Triangle triangle = new Triangle(5.0, 7.0, 11.5);
        System.out.println(triangle.getPerimeter() + " - " + triangle.getArea());

        Rectangle rectangle = new Rectangle(5.0, 15.0);
        System.out.println(rectangle.getPerimeter() + " - " + rectangle.getArea());
    }
}
