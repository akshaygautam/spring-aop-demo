package com.akshay.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.akshay.aopdemo.dao.Account;

@Aspect
@Component
@Order(2)
public class LoggingDemoAspect {
	@Before("com.akshay.aopdemo.aspect.PointCutExpressions.beforPackagePointcut())")
	public void beforPackagePointcut1(JoinPoint joinpoint) {
		System.out.println("****Executing before Package*****");
		System.out.println(joinpoint.getSignature());
		Object [] args = joinpoint.getArgs();
//		args.forEach(arg)->System.out.println(arg);
		for(Object arg:args) {
			System.out.println(arg);
		}
		
	}
	
	@Before("com.akshay.aopdemo.aspect.PointCutExpressions.combinedPointcuts()")
	public void beforeCumbine() {
		System.out.println("**********Combined Pointcuts******");
	}
	
	@AfterReturning("com.akshay.aopdemo.aspect.PointCutExpressions.afterReturningAccounts()")
	public void afterReturningFindAccountAdvice() {
		System.out.println("*****Returning******");
	}
	
	@AfterReturning(pointcut="com.akshay.aopdemo.aspect.PointCutExpressions.afterReturningAccounts()"
			,returning="result")
	public void afterReturningFindAccountAdviceResult(JoinPoint joinPoint, List<Account> result) {
		System.out.println("*****Returning From Aspect******");
		String method = joinPoint.getSignature().toString();
		System.out.println("*****Returning From Aspect Method is******\n"+method);
		System.out.println("*****Returning Return value From Aspect******\n"+result);
		System.out.println("*****End Aspect******");
		
	}
	
	@AfterReturning(pointcut="com.akshay.aopdemo.aspect.PointCutExpressions.afterReturningAccounts()"
			,returning="result")
	public void afterReturningFindAccountAdviceResultModified(JoinPoint joinPoint, List<Account> result) {
		System.out.println("-----------------Altered Data--------------------");
		
		String method = joinPoint.getSignature().toString();
		System.out.println("*****Returning From Aspect Method is******\n"+method);
		covertToUpperCase(result);
		System.out.println("*****Returning Return value From Aspect******\n"+result);
		
		System.out.println("-------------------------------------");
		
	}

	private void covertToUpperCase(List<Account> result) {
		for(Account res:result) {
			res.setName(res.getName().toUpperCase());
			res.setEmail(res.getEmail().toUpperCase());
		}
	}
}
