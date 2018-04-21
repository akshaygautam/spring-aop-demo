package com.akshay.aopdemo;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.akshay.aopdemo.service.TrafficFortuneService;

public class AroundMainDemoApp {

	private static Logger logger = Logger.getLogger(AroundLoggerMainDemoApp.class.getName());
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		TrafficFortuneService traffic = context.getBean(TrafficFortuneService.class);
		
		logger.info("Main app:\t"+traffic.getFortune());
		context.close();
	}

}
