package com.Java;

public class Rectangle extends Polygon {

    public Rectangle(Point topRightCorner, int width, int height) {
        vertices = new Point[4];
        vertices[0] = topRightCorner;
        vertices[1] = new Point(topRightCorner.getX(), topRightCorner.getY() - height);
        vertices[2] = new Point(topRightCorner.getX() - width, vertices[1].getY());
        vertices[3] = new Point(vertices[2].getX(), topRightCorner.getY());
    }

    public String getType() {
        return "Rectangle";
    }
}
