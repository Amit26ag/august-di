package com.august.augustdi;

import com.august.augustdi.controllers.*;
import com.august.augustdi.domain.MusicProvider;
import com.august.augustdi.services.GreetingsService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class AugustDiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(AugustDiApplication.class, args);

		I18NController i18NController = (I18NController) applicationContext.getBean("i18NController");
		System.out.println(i18NController.getGreeting());

		MusicProvider myMusicProvider = applicationContext.getBean(MusicProvider.class);
		System.out.println(myMusicProvider.getMusicSite());

//		MyController myController = (MyController) applicationContext.getBean("myController");
//		System.out.println("Hello message: " + myController.sayHello());
//
//		ConstructorDIController constructorDIController = (ConstructorDIController) applicationContext.getBean("constructorDIController");
//		System.out.println(constructorDIController.getGreeting());
//
//		SetterDIController setterDIController = (SetterDIController) applicationContext.getBean("setterDIController");
//		System.out.println(setterDIController.getGreeting());
//
//		PropertyDIController propertyDIController = (PropertyDIController) applicationContext.getBean("propertyDIController");
//		System.out.println(propertyDIController.getGreeting());
//
//		PrimaryDIController primaryDIController = (PrimaryDIController) applicationContext.getBean("primaryDIController");
//		System.out.println(primaryDIController.getGreeting());
	}

}
