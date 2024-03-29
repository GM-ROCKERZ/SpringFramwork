package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//read spring config file 
	ClassPathXmlApplicationContext context=
			new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from spring container
	Coach theCoach= context.getBean("tenniesCoach" ,Coach.class);
	Coach theSoccerCoach= context.getBean("soccer" ,Coach.class);
		
		//call a method on the bean
	System.out.println(theCoach.getDailyWorkout());	
	System.out.println(theSoccerCoach.getDailyWorkout());
	
	//call method to get the daily Fortune
	System.out.println(theCoach.getDailyFortune());
	
		//close the context
	     context.close();
	}

}
