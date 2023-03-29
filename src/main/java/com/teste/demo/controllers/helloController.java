package com.teste.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class helloController {
    @GetMapping
    public String getHello() {
        return "Olá Spring!";
    }
}
