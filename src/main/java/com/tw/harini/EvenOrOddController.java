package com.tw.harini;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EvenOrOddController {

    @RequestMapping("/")
    public String index() {
        return "I want to wait...";
    }
}
