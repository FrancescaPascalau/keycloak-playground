package com.francesca.pascalau.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @GetMapping("/hello")
    public String getHelloWorld() {
        return "Hello World!";
    }
}