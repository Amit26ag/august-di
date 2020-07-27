package com.august.augustdi.controllers;

import com.august.augustdi.services.GreetingsService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryDIController {

    private final GreetingsService greetingsService;

    public PrimaryDIController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreeting() {
        return greetingsService.getGreeting();
    }
}
