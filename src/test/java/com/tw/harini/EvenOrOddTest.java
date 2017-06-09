package com.tw.harini;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenOrOddTest {

    @Test
    public void shouldCheckOddOrEven() {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        assertEquals("even", evenOrOdd.checkEvenOrOdd(2));
    }

    @Test
    public void shouldReturnEven() {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        assertEquals("even", evenOrOdd.checkEvenOrOdd(4));
    }

    @Test
    public void shouldReturnOdd() {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        assertEquals("odd", evenOrOdd.checkEvenOrOdd(5));
    }
}
