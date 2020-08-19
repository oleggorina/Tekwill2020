package com.Java;

public class ArithmeticAverage {
    private int aInterval;
    private int bInterval;

    public ArithmeticAverage(int aInterval, int bInterval){
        this.aInterval = aInterval;
        this.bInterval = bInterval;
    }

    public double Average(){
        double sum = 0, result = 0;
        int count = 0;

        for(int i = aInterval; i <= bInterval; i++)
        {
            if (i % 3 == 0)
            {
                count ++;
                sum += i;
                result = sum / count;
            }
        }

        return result;
    }
}
