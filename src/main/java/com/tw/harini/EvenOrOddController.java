package com.tw.harini;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EvenOrOddController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot! Megha and Harini are paring..it should be amazing...Have a great day";
    }
}
