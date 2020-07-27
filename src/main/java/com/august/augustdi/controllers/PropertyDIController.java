package com.august.augustdi.controllers;

import com.august.augustdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyDIController {

    @Qualifier("greetingsServicePropertyImpl")
    @Autowired
    GreetingsService greetingsService;

    public String getGreeting() {
        return greetingsService.getGreeting();
    }

}
