package com.akshay.aopdemo.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(4)
public class ArroundAspect {
	private static Logger logger = Logger.getLogger(ArroundAspect.class.getName());
 	@Around("com.akshay.aopdemo.aspect.PointCutExpressions.aroundTraffic()")
	public Object logCloudAsync(ProceedingJoinPoint pjp)throws Throwable {
		logger.info("****Before call*****\t"+pjp.getSignature().toString());
		long start = System.currentTimeMillis();
		Object result = pjp.proceed();
		long end = System.currentTimeMillis();
		logger.info("****After call*****\t"+pjp.getSignature().toString());
		logger.info("Time taken = "+(double)(end-start)/1000);
		return result;
	}
	
}
