package com.august.augustdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingsServiceSetterImpl implements GreetingsService {
    @Override
    public String getGreeting() {
        return "Hello Humans! I'm GreetingsServiceSetterImpl.";
    }
}
