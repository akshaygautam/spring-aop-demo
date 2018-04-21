package com.akshay.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(4)
public class LogCloud {

	@Before("com.akshay.aopdemo.aspect.PointCutExpressions.beforPackagePointcut()")
	public void logCloudAsync() {
		System.out.println("****Log to cloud*****");
	}
	
}
