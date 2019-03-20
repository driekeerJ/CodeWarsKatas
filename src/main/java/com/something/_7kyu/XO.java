package com.something._7kyu;

// https://www.codewars.com/kata/55908aad6620c066bc00002a/train/java

public class XO {
    public static boolean getXO (String str) {

        return getCount(str, 'o') == getCount(str, 'x');

    }

    private static long getCount(final String str, char target) {
        String workingString = str.toLowerCase();
        return workingString.chars()
                .filter(c -> c == target)
                .count();
    }
}
