package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class AfterReturningDemoApp {

	public static void main(String[] args) {

		//read the spring config java class
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);

		// call the method to find the accounts
		
		List<Account> theAccounts = theAccountDAO.findAccounts();
		
		//display the accounts
		System.out.println("\n\nMain programe: AfterareturningDemoApp");
		System.out.println("----------");
		
		System.out.println(theAccounts);
		
		System.out.println("\n");


		//close the context
		context.close();
	}

}