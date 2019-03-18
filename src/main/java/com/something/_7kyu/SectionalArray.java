package com.something._7kyu;

// https://www.codewars.com/kata/58ef87dc4db9b24c6c000092/train/java

class SectionalArray {
    static int[] sort(final int[] array, final int start, final int... length) {
        int[] result = getFirstUnsorted(array, start);
        int end = length.length != 0 ? length[0] : array.length;

        for (int i = start; i < end; i++) {
            // Hier moet de vergelijking gaan komen.
            result[i] = array[i];
        }

        return result;
    }

    private static int[] getFirstUnsorted(final int[] array, final int start) {
        int[] result = new int[array.length];
        for (int i = 0; i < start; i++) {
            result[i] = array[i];
        }
        return result;
    }
}


