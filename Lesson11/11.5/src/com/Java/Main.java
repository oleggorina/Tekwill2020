package com.Java;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        for (Secret secret: Secret.values())
        {
            if (secret.toString().contains("STAR"))
            {
                count ++;
            }
        }
        System.out.println(count);
    }
}
