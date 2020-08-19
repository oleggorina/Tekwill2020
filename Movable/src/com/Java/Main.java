package com.Java;

public class Main {

    public static void main(String[] args) {
        Point topRight1 = new Point(20, 30);
        Movable rectangle1 = new Rectangle(topRight1, 10, 5);

        System.out.println(rectangle1);
        rectangle1.moveLeft(10);
        rectangle1.moveDown(25);

        System.out.println(rectangle1);
    }
}
