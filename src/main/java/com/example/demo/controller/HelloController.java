package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author YRG
 * Created by on 2018/7/30.
 * Describe
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "hello Spring Boot!";
    }
}
