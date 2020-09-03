package com.Java;

public class Converter {
    public static double convertStringToDouble(String input){
        double result;
        if (input.matches("\\d+")){
            result = Double.parseDouble(input);
        } else {
            result = 0;
        }

        return result;
    }
}
