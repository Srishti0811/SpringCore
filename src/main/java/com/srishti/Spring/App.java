package com.srishti.Spring;

//https://www.youtube.com/watch?v=If1Lw4pLLEo&t=2813s

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//We can also use mixed configuration.
//Tyre being xml based config with beans tag and Car using annotation(Component)

public class App 
{
	//Main function should be independent of Car and bike objects
		public static void main(String[] args) {
					
			//Spring
			//Which ever bean is available - car or bike, will be returned: - to define we need a xml. Will return that obj.
			//We can get getBean from 2 interfaces BeanFactory or ApplicationContext - both belong to spring framework
			//Bean factory is good for small applications
			//Appl context for large enterprise level appln. Its a superset of bean factory.
			//ClassPathXmlApplicationContext - is the class that implement ApplicationContext methods
			
			ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");		
			//update below to car or bike etc
			Vehicle obj = (Vehicle)context.getBean("car");
			obj.drive(); 
			
//			//using below to explain bean based config. (properties tag in spring.xml)
//			Tyre t = (Tyre)context.getBean("tyre");
//			System.out.println(t);
		
			
			
			
			/*
			 * //To avoid below tight coupling we can use interface. //But in this also we
			 * need to change the right side Vehicle v = new Car(); v.drive();
			 * 
			 * Vehicle v1 = new Bike(); v1.drive();
			 */
			
			
			//Below is tight coupling - change both right and left to 
			/*update from bike to car
			 * 
			 * Car car = new Car(); car.drive();
			 * 
			 * Bike obj = new Bike(); obj.drive();
			 */
			
			
		}
}
