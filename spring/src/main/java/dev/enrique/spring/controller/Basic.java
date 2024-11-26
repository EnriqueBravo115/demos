package dev.enrique.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Basic {
    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }
}
