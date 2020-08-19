package com.Java;
public class Triangle extends Polygon {

    public Triangle(Point p1, Point p2, Point p3) {
        vertices = new Point[3];
        vertices[0] = p1;
        vertices[1] = p2;
        vertices[2] = p3;
    }

    public String getType() {
        return "Triangle";
    }
}
