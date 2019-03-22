package com.something._7kyu;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  
  @Test
  public void simpleArray1() {
    assertEquals(2, getActualFor(1, 1, 2));
    assertEquals(5, getActualFor(4, 4, 4, 5, 4, 4, 4, 4, 4));
    assertEquals(3, getActualFor(4, 4, 4, 3, 4, 4, 4, 4, 4));
  }
  
  private int getActualFor(int... numbers) {
    return Solution.stray(numbers);
  }
}
