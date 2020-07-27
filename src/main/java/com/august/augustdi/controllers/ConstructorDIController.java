package com.august.augustdi.controllers;

import com.august.augustdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorDIController {

    private final GreetingsService greetingsService;

    public ConstructorDIController(@Qualifier("greetingsServiceConstructorImpl") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreeting() {
        return greetingsService.getGreeting();
    }

}
