package com.srishti.Spring;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	
	public void drive() {
		System.out.println("In Bike class");
	}
	
	
	

}
