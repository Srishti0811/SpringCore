package com.srishti.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Below is same as the bean defined in XML
//Default name will be car only - decapatalized.
@Component
public class Car implements Vehicle
{
	
	//Used to get instance of tired (when it is either XML based or annotation based)
	@Autowired
	Tyre tyre;
	
	
	public Tyre getTyre() {
		return tyre;
	}


	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}


	public void drive(){
		System.out.println("In Car class " + tyre);
	}
	

}
