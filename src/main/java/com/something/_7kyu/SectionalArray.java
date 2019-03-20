package com.something._7kyu;

// https://www.codewars.com/kata/58ef87dc4db9b24c6c000092/train/java

import java.util.Arrays;

import static java.lang.System.arraycopy;

class BestPracticeSectionalArray {
    static int[] sort(final int[] array, final int start, final int... length) {
        if (length.length == 0){
            Arrays.sort(array, start, array.length);
        } else {
            Arrays.sort(array, start, array.length - 1);
        }
        return array;
    }
}

class SectionalArray {
    static int[] sort(final int[] array, final int startSortingPosition, final int... length) {
        final int startArray = 0;
        final int arrayLength = array.length;
        final int lengthSorting = getLengthSorting(startSortingPosition, arrayLength, length);
        final int pointAfterSorting = startSortingPosition + lengthSorting;
        final int slotsAfterSorting = arrayLength - startSortingPosition - lengthSorting;
        final int[] toBeSorted = new int[lengthSorting];
        final int[] result = new int[array.length];

        arraycopy(array, startArray, result, startArray, startSortingPosition);
        arraycopy(array, startSortingPosition, toBeSorted, startArray, lengthSorting);
        int[] sorted = sortInts(toBeSorted);
        arraycopy(sorted, startArray, result, startSortingPosition, lengthSorting);

        if (slotsAfterSorting > 0)
            arraycopy(array, pointAfterSorting, result, pointAfterSorting, slotsAfterSorting);

        return result;
    }

    private static int getLengthSorting(final int startSortingPosition, final int arrayLength, final int[] length) {
        if (lengthIsGiven(length))
            if(lengthGivenNotOutsideArrayRange(startSortingPosition, arrayLength, length[0]))
                return length[0];
        return arrayLength - startSortingPosition;
    }

    private static boolean lengthGivenNotOutsideArrayRange(final int startSortingPosition, final int arrayLength, final int sortingLength) {
        return sortingLength + startSortingPosition <= arrayLength;
    }

    private static boolean lengthIsGiven(final int[] length) {
        return length.length > 0;
    }

    private static int[] sortInts(final int[] array) {
        return Arrays.stream(array)
                    .sorted()
                    .toArray();
    }
}


