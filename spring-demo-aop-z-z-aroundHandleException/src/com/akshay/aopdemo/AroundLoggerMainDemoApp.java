package com.akshay.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.akshay.aopdemo.service.TrafficFortuneService;

public class AroundLoggerMainDemoApp {

	public static void main(String[] args){
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		TrafficFortuneService traffic = context.getBean(TrafficFortuneService.class);
		
		
		try {
			boolean tripWire = true;
			System.out.println("Main app:\t"+traffic.getFortune(tripWire));
		} catch (Exception e) {
			e.printStackTrace();
		}
		context.close();
	}

}
