package com.Java;

public class Main {

    public static void main(String[] args) {
        User tim = new User();
        tim.setFirstName("Tim");
        tim.setLastName("Towler");
        System.out.println(tim.getFullName());

        User katie = new User();
        katie.setFirstName("Katie");
        katie.setLastName(null);
        System.out.println(katie.getFullName());
    }
}
