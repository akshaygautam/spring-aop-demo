package com.akshay.aopdemo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(4)
public class ArroundAspect {

 	@Around("com.akshay.aopdemo.aspect.PointCutExpressions.aroundTraffic()")
	public Object logCloudAsync(ProceedingJoinPoint pjp)throws Throwable {
		System.out.println("****Before call*****\t"+pjp.getSignature().toString());
		long start = System.currentTimeMillis();
		Object result = pjp.proceed();
		long end = System.currentTimeMillis();
		System.out.println("****After call*****\t"+pjp.getSignature().toString());
		System.out.println("Time taken = "+(end-start)/1000);
		return result;
	}
	
}
