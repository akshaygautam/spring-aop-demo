package com.akshay.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingDemoAspect {
	@Pointcut("execution(* com.akshay.aopdemo.dao.*.*(..))")
	private void beforPackagePointcut() {}//Runs before any other
	
	@Pointcut("execution(* get*(..))")
	private void getters() {}
	@Pointcut("execution(* set*())")
	private void setters() {}
	
	@Pointcut("beforPackagePointcut()&&!(getters()||setters())")
	private void cumbinedPointcuts() {}
	
	@Before("execution(void addAccount())")
	public void beforeAddAcoountAdvice() {
		System.out.println("Executing before any add account");
	}
	
	@Before("execution(void com.akshay.aopdemo.dao.MembershipDAO.addAccount())")
	public void beforeSpecificAddAcoountAdvice() {
		System.out.println("Executing before com.akshay.aopdemo.dao.MembershipDAO.addAccount()");
	}
	
	@Before("execution(void add*())")
	public void beforeAnyAddAdvice() {
		System.out.println("Executing before any add preciding method");
	}
	
	@Before("execution(String addAccounts(*))")
	public void beforeStringAddAcoountAdvice() {
		System.out.println("===>\nExecuting before String add account");
	}
	
	@Before("execution(* com.akshay.aopdemo.dao.*.*(..))")
	public void beforePackage() {
		System.out.println("\n****Executing before Package*****\n");
	}
	@Before("beforPackagePointcut())")
	public void beforPackagePointcut1() {
		System.out.println("\n****Executing before Package Point cut 1*****\n");
	}
	@Before("beforPackagePointcut()")
	public void beforPackagePointcut2() {
		System.out.println("\n****Executing before Package point cut 2*****\n");
	}
	
	@Before("cumbinedPointcuts()")
	public void beforeCumbine() {
		System.out.println("\nCombined Pointcuts \n");
	}
}
