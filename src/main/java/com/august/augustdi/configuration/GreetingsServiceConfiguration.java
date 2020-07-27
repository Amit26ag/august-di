package com.august.augustdi.configuration;

import com.august.augustdi.services.GreetingsService;
import com.august.augustdi.services.GreetingsServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingsServiceConfiguration {

    @Bean
    GreetingsServiceFactory greetingsServiceFactory() {
        return new GreetingsServiceFactory();
    }

    @Primary
    @Profile("none")
    GreetingsService primaryGreetingService(GreetingsServiceFactory greetingsServiceFactory) {
        return greetingsServiceFactory.getGreetingsService("primary");
    }

    @Bean("i18NGreetings")
    @Profile("HIN")
    GreetingsService spanishGreetingService(GreetingsServiceFactory greetingsServiceFactory) {
        return greetingsServiceFactory.getGreetingsService("HIN");
    }

    @Bean("i18NGreetings")
    @Primary
    @Profile({"default","EN"})
    GreetingsService englishGreetingService(GreetingsServiceFactory greetingsServiceFactory) {
        return greetingsServiceFactory.getGreetingsService("EN");
    }

}
