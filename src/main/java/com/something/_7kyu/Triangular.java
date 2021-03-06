package com.something._7kyu;

// https://www.codewars.com/kata/triangular-treasure/train/java

// Triangular numbers are so called because of the equilateral triangular shape that they occupy when laid out as dots. i.e.
//
//        1st (1)   2nd (3)    3rd (6)
//        You need to return the nth triangular number. You should return 0 for out of range values:
//
//        all [
//        triangular 0     == 0,
//        triangular 2     == 3,
//        triangular 3     == 6,
//        triangular (-10) == 0
//        ] -- True

public class Triangular {
    public static int triangular(int n) {
        if (n <= 0) return 0;
        int counter = 0;
        int result = 0;
        while (counter < n) {
            result+= (n - counter);
            counter++;
        }
        return result;
    }
}
