package com.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public class concatPositiveNumbersProblem {
        public static ArrayList<Integer> concatPositiveNumbers(ArrayList<Integer> l1, ArrayList<Integer> l2) {
            ArrayList<Integer> result = new ArrayList<>();
            for (Integer integer : l1) {
                if (integer >= 0){
                    result.add(integer);
                }
            }

            for (Integer integer : l2) {
                if (integer >= 0){
                    result.add(integer);
                }
            }
            return result;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list1 = readArrayList(scanner);
        ArrayList<Integer> list2 = readArrayList(scanner);
        ArrayList<Integer> result = concatPositiveNumbersProblem.concatPositiveNumbers(list1, list2);
        result.forEach(n -> System.out.println(n + " "));
    }

    private static ArrayList<Integer> readArrayList(Scanner scanner){
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
        }
}
