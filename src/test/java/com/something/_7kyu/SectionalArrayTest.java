package com.something._7kyu;

import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public final class SectionalArrayTest {
    private static void test(final int[] expected, final int[] input, final int start, final int... length) {
        assertArrayEquals("For input " + Arrays.toString(input) + " with start = " + start +
                        " and length " + (length.length == 1 ? "= " + length[0] : "not given") + ' ',
                expected, SectionalArray.sort(input, start, length));
    }

    @Test public void basicTests() {
        test(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{1, 2, 5, 7, 4, 6, 3, 9, 8}, 2);
        test(new int[]{1, 2, 5, 7, 4, 6, 3, 9, 8}, new int[]{1, 2, 5, 7, 4, 6, 3, 9, 8}, 8);

    }

    @Test public void testWithLength() {
        test(new int[]{9, 7, 1, 2, 3, 4, 5, 8, 6}, new int[]{9, 7, 4, 2, 5, 3, 1, 8, 6}, 2, 5);
        test(new int[]{1, 2, 5, 7, 4, 6, 3, 9, 8}, new int[]{1, 2, 5, 7, 4, 6, 3, 9, 8}, 8, 3);
        test(new int[]{813484, 394252, 573412, 937826, 860715, 977893, 886265, 855090, 878475, 725565},
                new int[]{813484, 394252, 573412, 937826, 860715, 977893, 886265, 855090, 878475, 725565},7 ,2);
    }

    @Test public void emptyLists() {
        test(new int[]{}, new int[]{}, 0);
    }
}
