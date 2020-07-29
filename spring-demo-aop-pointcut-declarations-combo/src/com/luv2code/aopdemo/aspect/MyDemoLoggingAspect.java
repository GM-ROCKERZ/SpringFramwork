package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	@Pointcut("execution( * com.luv2code.aopdemo.dao.*.*(..))")
	private void forDAOPackage() {}
	
	// create pointcut for getter method
	
	@Pointcut("execution( * com.luv2code.aopdemo.dao.*.get*(..))")
   private void getter() {}
	
	//create pointcut for setter methods 
	
	@Pointcut("execution( * com.luv2code.aopdemo.dao.*.set*(..))")
   private void setter() {}
	
	//create pointcut : include package ... exclude getter/setter
	
	@Pointcut("forDAOPackage() && !(getter() || setter())")
	private void forDAOPackageNoGetterSetter() {}
	
	@Before("forDAOPackageNoGetterSetter()")
	public void beforeAddAccountAdvice() {
		
		System.out.println("\n=========Executing @Before on addAccount()");
	}
	
	@Before("forDAOPackageNoGetterSetter()")
	public void performApiAnalytics() {
		
		System.out.println("\n=========Performing Api Analytics");
	}
}
