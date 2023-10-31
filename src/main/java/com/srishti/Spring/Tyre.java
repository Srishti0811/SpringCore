package com.srishti.Spring;

import org.springframework.stereotype.Component;

//Used to demonstrate example of property tag inside a bean
//@Component
public class Tyre
{
	private String brand;

//	//Constructor injection
//	public Tyre(String brand) {
//		super();
//		this.brand = brand;
//	}

	public String getBrand() {
		return brand;
	}

	//When we use property tag we are actually using a setter. - Setter injection
	//We can also set the value using constructor - Constructor injection
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre";
		//use for property tags:
		//return "Tyre [brand=" + brand + "]";
	}

}
