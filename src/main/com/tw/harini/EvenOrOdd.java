package com.tw.harini;

/**
 * Created by harinivs on 06/06/17.
 */
public class EvenOrOdd {
    public String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "even";
        }
        return "odd";
    }

    public static void main(String[] args) {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        System.out.println(evenOrOdd.checkEvenOrOdd(2));
    }
}
