package com.something.Temp;

import static com.something.Temp.GenericsLambdaApp.geldig;

import org.junit.Test;

public class GenericsLambdaAppTest {


    @Test
    public void test() {
        Integer[] nummers = {1,2,3,4,5};
        System.out.println("Nummers groter dan 3: " + geldig(nummers, n -> n > 3 ));
        System.out.println("Nummers groter dan 2 en kleiner dan 5: " + geldig(nummers, n -> n > 2  && n < 5));
    }

    @Test
    public void test2() {
        String[] woorden = {"een", "twee"};
        System.out.println("Woorden groter dan 2: " + geldig(woorden, woord -> woord.length() > 2));
        System.out.println("Woorden met een w:" + geldig(woorden, woord -> woord.contains("w")));
    }
}
