package com.something._7kyu;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Triangular_Test {
    @Test
    public void test_Two_Should_Be_Three() throws Exception {
          assertEquals(3, Triangular.triangular(2));
    }
    
    @Test
    public void test_Four_Should_Be_Ten() throws Exception {
          assertEquals(10, Triangular.triangular(4));
    }
}
