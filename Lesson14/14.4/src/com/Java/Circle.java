package com.Java;

public class Circle implements MutableShape{
    private float centerX;
    private float centerY;
    private float radius;

    public Circle(float centerX, float centerY, float radius)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public float getCenterX()
    {
        return centerX;
    }

    public float getCenterY()
    {
        return centerY;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public void move(float dx, float dy) {
        dx += centerX;
        dy += centerY;
    }

    @Override
    public void scale(float factor) {
        radius *= factor;
    }
}
