package com.akshay.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect

public class PointCutExpressions {
	@Pointcut("execution(* com.akshay.aopdemo.dao.*.*(..))")
	public void beforPackagePointcut() {}
	
	@Pointcut("execution(* get*(..))")
	public void getters() {}
	@Pointcut("execution(* set*())")
	public void setters() {}
	
	@Pointcut("beforPackagePointcut()&&!(getters()||setters())")
	public void combinedPointcuts() {}
	
	@Pointcut("execution(* findAccount(..))")
	public void afterReturningAccounts() {}
	
	@Pointcut("execution(* findAccount(..))")
	public void afterThrowingAccounts() {}
	
	@Pointcut("execution(* getFortune())")
	public void aroundTraffic() {}
	
	@Pointcut("execution(* getFortune(..))")
	public void aroundTrafficExce() {}
	
}
