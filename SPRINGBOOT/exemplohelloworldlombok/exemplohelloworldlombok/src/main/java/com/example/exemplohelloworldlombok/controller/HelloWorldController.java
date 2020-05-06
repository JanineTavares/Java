package com.example.exemplohelloworldlombok.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author Janine Tavares
 * @since 15/04/2020
 * @version 1.0
 */
@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String index() {
        return "Agora sim, com Lombok sou dev já!";
    }
}
