package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LuvAopExpressions {
	@Pointcut("execution( * com.luv2code.aopdemo.dao.*.*(..))")
	public void forDAOPackage() {}
	
	// create pointcut for getter method
	
	@Pointcut("execution( * com.luv2code.aopdemo.dao.*.get*(..))")
   public void getter() {}
	
	//create pointcut for setter methods 
	
	@Pointcut("execution( * com.luv2code.aopdemo.dao.*.set*(..))")
   public void setter() {}
	
	//create pointcut : include package ... exclude getter/setter
	
	@Pointcut("forDAOPackage() && !(getter() || setter())")
	public void forDAOPackageNoGetterSetter() {}
	

}
