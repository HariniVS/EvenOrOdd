package com.tw.harini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EvenOrOdd {
    public String checkEvenOrOdd(int number){
        if (number % 2 == 0) {
            return "even";
        }
        return "odd";
    }

    public static void main(String[] args) {
        SpringApplication.run(EvenOrOdd.class, args);
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        System.out.println(evenOrOdd.checkEvenOrOdd(2));
    }
}

