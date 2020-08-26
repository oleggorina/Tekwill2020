package com.Java;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionUtils {
    public static Collection<Integer> pow2 (Collection<Integer> numbers){
        Collection<Integer> result = new ArrayList<>();
        for (Integer i: numbers) {
            result.add(i * i);
        }
        return result;
    }
}
