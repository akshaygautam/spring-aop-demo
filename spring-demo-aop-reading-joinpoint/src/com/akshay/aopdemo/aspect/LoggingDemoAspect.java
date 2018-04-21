package com.akshay.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(-4)
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
}
