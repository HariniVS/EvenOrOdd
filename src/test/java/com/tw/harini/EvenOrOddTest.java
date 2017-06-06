package com.tw.harini;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by harinivs on 06/06/17.
 */
public class EvenOrOddTest {

    @Test
    public  void shouldgCheckOddOrEven(){
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        assertEquals("even", evenOrOdd.checkEvenOrOdd(2));
    }

}
