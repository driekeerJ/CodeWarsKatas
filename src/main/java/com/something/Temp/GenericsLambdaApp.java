package com.something.Temp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class GenericsLambdaApp {

    static <T> List<T> geldig(T[] invoer, Predicate<T> filter) {
        List<T> uitvoer = new ArrayList<>();
        for (T element : invoer) {
            if (filter.test(element)) {
                uitvoer.add(element);
            }
        }
        return uitvoer;
    }
}
