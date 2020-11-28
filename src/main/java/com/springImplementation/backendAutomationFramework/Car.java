package com.springImplementation.backendAutomationFramework;

import org.springframework.stereotype.Component;

@Component
public abstract class Car {

	public void configuration1()
	{
		System.out.println("add car configuration");
	}
	
	public abstract void gear();
	
}
