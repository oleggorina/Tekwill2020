package com.Java;

public class Rectangle implements MutableShape{
    private float x;
    private float y;
    private float width;
    private float height;

    public Rectangle(float x, float y, float w, float h)
    {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public void move(float dx, float dy) {
        dx += x;
        dy += y;
    }

    @Override
    public void scale(float factor) {
        width *= factor;
        height *= factor;
    }
}
