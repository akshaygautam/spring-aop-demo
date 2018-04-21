package com.akshay.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(-4)
public class LoggingDemoAspect {
	
//	@Before("execution(void addAccount())")
//	public void beforeAddAcoountAdvice() {
//		System.out.println("Executing before any add account");
//	}
//	
//	@Before("execution(void com.akshay.aopdemo.dao.MembershipDAO.addAccount())")
//	public void beforeSpecificAddAcoountAdvice() {
//		System.out.println("Executing before com.akshay.aopdemo.dao.MembershipDAO.addAccount()");
//	}
//	
//	@Before("execution(void add*())")
//	public void beforeAnyAddAdvice() {
//		System.out.println("Executing before any add preciding method");
//	}
//	
//	@Before("execution(String addAccounts(*))")
//	public void beforeStringAddAcoountAdvice() {
//		System.out.println("===>\nExecuting before String add account");
//	}
//	
//	@Before("execution(* com.akshay.aopdemo.dao.*.*(..))")
//	public void beforePackage() {
//		System.out.println("\n****Executing before Package*****\n");
//	}
	@Before("com.akshay.aopdemo.aspect.PointCutExpressions.beforPackagePointcut())")
	public void beforPackagePointcut1() {
		System.out.println("****Executing before Package*****");
	}
	
	@Before("com.akshay.aopdemo.aspect.PointCutExpressions.combinedPointcuts()")
	public void beforeCumbine() {
		System.out.println("**********Combined Pointcuts******");
	}
}
