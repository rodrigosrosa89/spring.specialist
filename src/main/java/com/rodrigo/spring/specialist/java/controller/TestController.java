package com.rodrigo.spring.specialist.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/primeira-tela")
    public String primeiraTela() {
        System.out.println("Primeiro teste com thymeleaf + java + springboot");
        return "teste";
    }
}
