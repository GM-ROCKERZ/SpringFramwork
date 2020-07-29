package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		//read spring config file 
	AnnotationConfigApplicationContext context=
			new AnnotationConfigApplicationContext(SportConfig.class);
		
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
