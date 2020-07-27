package com.august.augustdi.controllers;

import com.august.augustdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterDIController {

    private GreetingsService greetingsService;

    @Autowired
    public void setGreetingsService(@Qualifier("greetingsServiceSetterImpl") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreeting() {
        return greetingsService.getGreeting();
    }

}
