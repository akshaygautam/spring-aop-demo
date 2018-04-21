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
}
