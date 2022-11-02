package com.example.sbdeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {

    @GetMapping("/")
    public String Hello() {
        return "Hello world";
    }

    @GetMapping("/hello")
    public String newHello() {
        return "Hello again";
    }
}

