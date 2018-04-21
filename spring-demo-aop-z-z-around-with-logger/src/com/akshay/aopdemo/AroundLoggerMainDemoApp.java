package com.akshay.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.akshay.aopdemo.service.TrafficFortuneService;

public class AroundLoggerMainDemoApp {

	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		TrafficFortuneService traffic = context.getBean(TrafficFortuneService.class);
		
		System.out.println("Main app:\t"+traffic.getFortune());
		context.close();
	}

}
