package com.Java;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("ABC123");
        Car car = new Car("ABC123", 4);
        System.out.println(vehicle.toString());
        System.out.println(car.toString());

    }
}
