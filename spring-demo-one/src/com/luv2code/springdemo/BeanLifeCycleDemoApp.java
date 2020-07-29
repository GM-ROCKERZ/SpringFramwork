package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		//load the spring config file 
		
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve bean from spring conatainer
		Coach theCoach =context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach =context.getBean("myCoach", Coach.class);
		
		//check if they are same
		boolean result=(theCoach==alphaCoach);
		
		System.out.println("\n pointing to the same object: " +result);
		System.out.println("\nMemory location for the theCoach"+theCoach);
		System.out.println("\nMemory location for the alphaCoach"+alphaCoach +"\n");

		
		//close the context
		context.close();
	}

}
