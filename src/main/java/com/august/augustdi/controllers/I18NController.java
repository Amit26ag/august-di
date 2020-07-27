package com.august.augustdi.controllers;

import com.august.augustdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18NController {

    private final GreetingsService greetingsService;

    public I18NController(@Qualifier("i18NGreetings") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreeting() {
        return greetingsService.getGreeting();
    }
}
