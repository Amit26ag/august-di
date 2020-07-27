package com.august.augustdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile({"EN", "default"})
//@Service("i18NGreetings")
public class GreetingsServiceI18NEnglish implements GreetingsService{

    @Override
    public String getGreeting() {
        return "Hello Humans! Greetings from English!";
    }
}
