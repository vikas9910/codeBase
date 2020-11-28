package com.springImplementation.backendAutomationFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle
{
   @Autowired
	public Car car;
	
	
	public void configuration() {
		
		System.out.println("add Bike configration");
		car.configuration1();
		System.out.println("Experiment************************");
	}

	public void gears() {
		
		System.out.println("add Bike gears");
	}

}
