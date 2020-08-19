package com.Java;
public abstract class Polygon implements Movable {

    protected Point[] vertices;

    @Override
    public void moveUp(int distance) {
        for (Point vertex : vertices) {
            vertex.moveUp(distance);
        }
    }

    @Override
    public void moveDown(int distance) {
        for (Point vertex : vertices) {
            vertex.moveDown(distance);
        }
    }

    @Override
    public void moveLeft(int distance) {
        for (Point vertex : vertices) {
            vertex.moveLeft(distance);
        }
    }

    @Override
    public void moveRight(int distance) {
        for (Point vertex : vertices) {
            vertex.moveRight(distance);
        }
    }

    public abstract String getType();

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(getType());
        for (Point vertex : vertices) {
            result.append(" ").append(vertex);
        }
        return result.toString();
    }
}
