package com.Java;
public class Circle implements Movable {

    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void moveUp(int distance) {
        center.moveUp(distance);
    }

    @Override
    public void moveDown(int distance) {
        center.moveDown(distance);
    }

    @Override
    public void moveLeft(int distance) {
        center.moveLeft(distance);
    }

    @Override
    public void moveRight(int distance) {
        center.moveRight(distance);
    }

    @Override
    public String toString() {
        return "Circle " + center + " : " + radius;
    }
}
