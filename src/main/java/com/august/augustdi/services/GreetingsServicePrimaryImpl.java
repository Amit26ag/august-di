package com.august.augustdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingsServicePrimaryImpl implements GreetingsService {
    @Override
    public String getGreeting() {
        return "Hello Humans! I'm the primary Bean of GreetingsService.";
    }
}
