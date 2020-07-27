package com.august.augustdi.controllers;

import com.august.augustdi.services.GreetingsServiceConstructorImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyDIControllerTest {

    PropertyDIController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyDIController();
        controller.greetingsService = new GreetingsServiceConstructorImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}