package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // Mapping for root "/"
    @GetMapping("/")
    public String home() {
        return "Welcome to my Spring Boot app!";
    }

    // Mapping for "/app"
    @GetMapping("/app")
    public String app() {
        return "Hi hello, this is Kalasritha!";
    }
}

