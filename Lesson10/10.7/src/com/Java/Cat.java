package com.Java;

public class Cat
{
    String name;
    int age;
    static int counter;

    public Cat (String name, int age)
    {
        this.name = name;
        this.age = age;
        counter ++;
    }

    public static int getNumberOfCats()
    {
        System.out.println(counter);
        if (counter > 5)
        {
            System.out.println("You have too many cats");
        }
        return counter;
    }
}
