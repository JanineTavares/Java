package com.example.exemplohelloworldRota.controller;

import com.example.exemplohelloworldRota.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
/**
 * @author Janine Tavares
 * @since 15/04/2020
 * @version 1.0
 */
@RestController
public class HelloWorldController {


    @GetMapping("/")
    public String index() {
        return "Agora sim, valo dale";
    }





}
