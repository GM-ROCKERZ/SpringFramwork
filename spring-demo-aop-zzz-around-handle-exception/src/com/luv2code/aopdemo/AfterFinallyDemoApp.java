package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class AfterFinallyDemoApp {

	public static void main(String[] args) {

		//read the spring config java class
		
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);

		// call the method to find the accounts

		List<Account> theAccounts = null;
		
		try {
			
			// add a boolean flag to simulate exceptions
			boolean tripwire = false;
			theAccounts=theAccountDAO.findAccounts(tripwire);
		}
		catch(Exception exc) {

			System.out.println("\n\n Main Programe ....  caught exception:  "+exc);

		}
		//display the accounts
		System.out.println("\n\nMain programe: AfterthrowingDemoApp");
		System.out.println("----------");

		System.out.println(theAccounts);

		System.out.println("\n");


		//close the context
		context.close();
	}

}
