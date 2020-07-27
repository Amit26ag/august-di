package com.august.augustdi.services;

public class GreetingsServiceFactory {

    public GreetingsService getGreetingsService(String lang) {
        switch (lang) {
            case "EN":
                return new GreetingsServiceI18NEnglish();
            case "HIN":
                return new GreetingsServiceI18NSpanish();
            default:
                return new GreetingsServicePrimaryImpl();
        }
    }
}
