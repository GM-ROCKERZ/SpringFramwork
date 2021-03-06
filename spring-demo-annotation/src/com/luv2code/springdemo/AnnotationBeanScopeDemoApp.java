package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
	
		//load spring config file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrive bean from the spring container
		
		Coach theCoach=context.getBean("tenniesCoach",Coach.class);
		
		Coach alphaCoach=context.getBean("tenniesCoach",Coach.class);
		
		//check if they are the same
     boolean result = (theCoach==alphaCoach);
		
     //print out the result
     
     System.out.println("\npointing to the same object:"+result);
     
     System.out.println("\nMemory location for theCoach:"+theCoach);
     System.out.println("\nMemory location for alphaCoach:"+alphaCoach);
     
   //close the context
	  context.close();
	}
	
	

}
