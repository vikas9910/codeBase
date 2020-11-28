package com.springImplementation.backendAutomationFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mainRunner {

	public static void main(String[] args) {
		
		
		
		
		/*Vehicle vehicle=new Bike();
		vehicle.configuration();
		
		
		Honda honda=new Honda();
		honda.configuration1();
		honda.gear();*/
		
	ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);
		
	 Bike b=factory.getBean(Bike.class);
	 b.configuration();
		

	 
	 
	}

}
