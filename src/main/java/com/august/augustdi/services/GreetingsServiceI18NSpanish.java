package com.august.augustdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile("HIN")
//@Service("i18NGreetings")
public class GreetingsServiceI18NSpanish implements GreetingsService {

    @Override
    public String getGreeting() {
        return "नमस्कार इंसानो! शुभकामना हिंदी की तरफ से!";
    }
}
