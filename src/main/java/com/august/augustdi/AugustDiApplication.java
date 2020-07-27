package com.august.augustdi;

import com.august.augustdi.controllers.*;
import com.august.augustdi.services.GreetingsService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {GreetingsService.class}, basePackages = {"com.august.augustdi"})
public class AugustDiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(AugustDiApplication.class, args);

		I18NController i18NController = (I18NController) applicationContext.getBean("i18NController");
		System.out.println(i18NController.getGreeting());

		MyController myController = (MyController) applicationContext.getBean("myController");
		System.out.println("Hello message: " + myController.sayHello());

		ConstructorDIController constructorDIController = (ConstructorDIController) applicationContext.getBean("constructorDIController");
		System.out.println(constructorDIController.getGreeting());

		SetterDIController setterDIController = (SetterDIController) applicationContext.getBean("setterDIController");
		System.out.println(setterDIController.getGreeting());

		PropertyDIController propertyDIController = (PropertyDIController) applicationContext.getBean("propertyDIController");
		System.out.println(propertyDIController.getGreeting());

		PrimaryDIController primaryDIController = (PrimaryDIController) applicationContext.getBean("primaryDIController");
		System.out.println(primaryDIController.getGreeting());
	}

}
