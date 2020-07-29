package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		//read spring config file 
	AnnotationConfigApplicationContext context=
			new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get bean from spring container
	SwimCoach theCoach= context.getBean("swimCoach" ,SwimCoach.class);
	//Coach theSoccerCoach= context.getBean("soccer" ,Coach.class);
		
		//call a method on the bean
	System.out.println(theCoach.getDailyWorkout());	
	//System.out.println(theSoccerCoach.getDailyWorkout());
	
	//call method to get the daily Fortune
	System.out.println(theCoach.getDailyFortune());
	
	//call our new swim coach method .. has the props value injected
	 System.out.println("email :"+theCoach.getEmail());
	 
	 System.out.println("email :"+theCoach.getTeam());
	
		//close the context
	     context.close();
	}

}
