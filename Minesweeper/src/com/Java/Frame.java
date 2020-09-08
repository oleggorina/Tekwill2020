package com.Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Frame {
    private static final char EMPTY_SPACE = '.';
    private static final char MINE = '*';
    private static final int SIZE = 9;
    private static final int NR_OF_FIELDS = SIZE * SIZE;
    private static final Random rand = new Random();
    private static final List<Character> fields = init();

    public static List<Character> init() {
        List<Character> fields = new ArrayList<>(NR_OF_FIELDS);
        for (int i = 0; i < NR_OF_FIELDS; i++) {
            fields.add(EMPTY_SPACE);
        }
        return fields;
    }

    public static void print(){
        for (int i = 0; i < NR_OF_FIELDS ; i++) {
            if (i != 0 && i % SIZE == 0){
                System.out.println();
            }
            System.out.print(fields.get(i));
        }
    }

    public static void fillWithMines(int nrOfMines) {
        for (int i = 0; i < nrOfMines; i++) {
            int r = rand.nextInt(NR_OF_FIELDS);
            while (fields.get(r) == MINE) {
                r = rand.nextInt(NR_OF_FIELDS);
            }
            fields.set(r, MINE);
        }
    }

    public static void countMines(){
        
    }
}
